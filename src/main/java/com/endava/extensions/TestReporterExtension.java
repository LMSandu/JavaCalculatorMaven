package com.endava.extensions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

public class TestReporterExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback, TestExecutionListener {

    private static final Logger LOGGER = LogManager.getLogger(TestReporterExtension.class);

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        LOGGER.info("Starting test {}/{}", extensionContext.getTestClass().get().getSimpleName(), extensionContext.getDisplayName());

    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        LOGGER.info("Finishing test {}/{}", extensionContext.getTestClass().get().getSimpleName(), extensionContext.getDisplayName());
    }

    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        if (testIdentifier.isTest()) {
            LOGGER.info("Starting test {}", testIdentifier.getDisplayName());
        }
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        if (testIdentifier.isTest()) {
            LOGGER.info("Test {} finished with result: {} ", testIdentifier.getDisplayName(), testExecutionResult.getStatus().toString());

        }
    }
}

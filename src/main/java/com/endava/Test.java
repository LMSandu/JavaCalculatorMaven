package com.endava;

import com.endava.extensions.TestReporterExtension;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.PrintWriter;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class Test {


    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(
                selectClass(TestReporterExtension.class)).build();

        Launcher launcher = LauncherFactory.create();

        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener, new TestReporterExtension());

        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.err));
    }


}


// Set the executable file permission for the bin/run-app-localdev.sh file after the project has been generated.
// See: https://stackoverflow.com/a/44490223
new File(request.getOutputDirectory(), request.getArtifactId() + "/bin/run-app-localdev.sh").setExecutable(true, true);

package hexlet.code;

import picocli.CommandLine;


@CommandLine.Command(name = "gendiff", mixinStandardHelpOptions = true,
        description = "Compares two configuration files and shows a difference.")



public class App {
    @CommandLine.Parameters(paramLabel = "filepath1", description = "path to first file")
    private String filepath1;

    @CommandLine.Parameters(paramLabel = "filepath2", description = "path to second file")
    private String filepath2;

    @CommandLine.Option(names = { "-f", "--file" }, paramLabel = "format", description = "output format [default: stylish]")
    private String format = "";

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

}

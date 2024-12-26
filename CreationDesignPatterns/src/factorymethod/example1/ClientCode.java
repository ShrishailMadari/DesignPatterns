package factorymethod.example1;
interface FileGenerator{
    void generateFile();
}
class PdfGenerator implements FileGenerator{

    @Override
    public void generateFile() {
        System.out.println("Generating PDF files");
    }
}
class CsvFileGenerator implements FileGenerator{

    @Override
    public void generateFile() {
        System.out.println("generating Csv files");
    }
}
class DockFileGenerator implements FileGenerator{

    @Override
    public void generateFile() {
        System.out.println("generating the Document file");
    }
}
class FileGeneratorFactory{
    public FileGenerator createFiles(String fileType){
        switch (fileType){
            case "Pdf":
                return new PdfGenerator();
            case "Csv":
                return new CsvFileGenerator();
            case "Docs":
                return new DockFileGenerator();
            default:
                throw new IllegalArgumentException("unknown file type"+fileType);
        }

    }
}
public class ClientCode {
    public static void main(String[] args) {
        FileGeneratorFactory fileGeneratorFactory = new FileGeneratorFactory();
        FileGenerator pdf = fileGeneratorFactory.createFiles("Pdf");
        pdf.generateFile();
    }
}

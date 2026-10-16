//10.Business requirement: A company stores documents in local storage during development,
//and in cloud storage such as Amazon S3 or Azure Blob Storage in production.
//Business services should not depend directly on a particular storage vendor.

interface DocumentStorage{
    void upload(String fileName);
    void download(String fileName);
}

class LocalStorage implements DocumentStorage{
    @Override
    public void upload(String fileName) {
        System.out.println("Uploaded file "+fileName+" to Local storage..");
    }

    @Override
    public void download(String fileName) {
        System.out.println("File "+fileName+" downloaded from Local storage..");
    }
}

class AmazonS3 implements DocumentStorage{
    @Override
    public void upload(String fileName) {
        System.out.println("Uploaded file "+fileName+" to Amazon S3..");
    }

    @Override
    public void download(String fileName) {
        System.out.println("File "+fileName+" downloaded from Amazon S3..");
    }
}

public class Storage {

    public static void main(String[] args){
        DocumentStorage obj1 = new AmazonS3();
        obj1.upload("Spec.md");
        obj1.download("Spec.md");
        System.out.println();
        DocumentStorage obj2 = new LocalStorage();
        obj2.upload("Spec.md");
        obj2.download("Spec.md");
    }
}

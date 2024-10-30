package jdbc3.view;

import jdbc3.entity.Product;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

public class productView {

    public void printHeader(){
        System.out.println("********************************");
        System.out.println("********  Product List  ********");
        System.out.println("********************************");
        System.out.println();
    }
    public void printFooter(){
        System.out.println("*********************************");
        System.out.println("**********  End Print  **********");
        System.out.println("*********************************");
    }
    public void printProduct(ArrayList<Product> proList){
        for (Product product : proList){
            System.out.println("* 제품번호: "+product.getProNum());
            System.out.println("* 제품명: "+product.getProName());
            System.out.println("* 재고량: "+product.getProStock());
            System.out.println("* 단가: "+product.getProPrice());
            System.out.println("* 제조업체: "+product.getProduceName());
            System.out.println();
        }
    }
    public static void printView(ArrayList<Product> arrList) {
        productView view = new productView();
        view.printHeader();
        view.printProduct(arrList);
        view.printFooter();
    }
}

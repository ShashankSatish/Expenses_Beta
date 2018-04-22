/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.pojo;

/**
 *
 * @author Maraxys
 */
public class GlobalData {
    public static boolean categorySelected;
    public static String category;

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        GlobalData.category = category;
    }

    public static boolean isCategorySelected() {
        return categorySelected;
    }

    public static void setCategorySelected(boolean categorySelected) {
        GlobalData.categorySelected = categorySelected;
    }

    

    
}

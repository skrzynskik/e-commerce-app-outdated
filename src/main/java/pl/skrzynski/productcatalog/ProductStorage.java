package pl.skrzynski.productcatalog;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductStorage {
    // Storage
    static Map<String, ProductData> products;

    public static void save(ProductData newProduct) {
        products.put(newProduct.getId(), newProduct);
    }

    public static ProductData load(String productId) {
        return products.get(productId);
    }

    public static List<ProductData> allPublished() {
        return products.values()
                .stream()
                .filter(productData -> productData.isOnline())
                .collect(Collectors.toList());
    }
}

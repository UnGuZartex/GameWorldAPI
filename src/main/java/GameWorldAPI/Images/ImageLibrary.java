package GameWorldAPI.Images;

import java.awt.*;
import java.util.HashMap;

public class ImageLibrary {

    /**
     * Variable referring to the images in this library.
     */
    private final HashMap<String, Image> images;

    /**
     * Variable referring to the default image name
     */
    private static final String notFoundFileName = "notFound";

    /**
     * Initialise a new library with given images.
     *
     * @param images The images for this library.
     *
     * @post The images of this library are set to the given library.
     *
     * @throws IllegalArgumentException
     *         If the given images are null.
     *
     */
    protected ImageLibrary(HashMap<String, Image> images) throws IllegalArgumentException {
        if (images == null) {
            throw new IllegalArgumentException("The given image map is null!");
        }

        this.images = images;
    }

    /**
     * Get the default 'not found' image.
     *
     * @return The default image.
     */
    public static String getNotFoundFileName() {
        return notFoundFileName;
    }

    /**
     * Get the image with the given name.
     *
     * @param imageName The name of the image to get.
     *
     * @return If the given image exists, then it is returned, otherwise
     *         the default image is returned.
     */
    public Image getImage(String imageName) {

        if (images.get(imageName) == null) {
            imageName = notFoundFileName;
        }

        return images.get(imageName);
    }
}

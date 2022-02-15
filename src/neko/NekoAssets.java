package neko;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class NekoAssets {
    public static BufferedImage nekoAssetsImage = Neko.settings.getAssetFromSettings("pet");


    public static ImageIcon[] animateLeft() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");


        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(0, 96, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 96, 32, 32))
        };
    }

    public static ImageIcon[] animateRight() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{

                new ImageIcon(nekoAssetsImage.getSubimage(64, 96, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 96, 32, 32))
        };
    }

    public static ImageIcon[] animateTop() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(0, 64, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 64, 32, 32))
        };
    }

    public static ImageIcon[] animateBottom() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(64, 64, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 64, 32, 32))
        };
    }

    public static ImageIcon[] animateLeftTop() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(0, 128, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 128, 32, 32))
        };
    }

    public static ImageIcon[] animateLeftBottom() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(0, 160, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 160, 32, 32))
        };
    }

    public static ImageIcon[] animateRightTop() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(64, 128, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 128, 32, 32))
        };
    }

    public static ImageIcon[] animateRightBottom() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(64, 160, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 160, 32, 32))
        };
    }

    public static ImageIcon[] animateScratchLeft() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(0, 224, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 224, 32, 32))
        };
    }

    public static ImageIcon[] animateScratchRight() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(64, 224, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 224, 32, 32))
        };
    }

    public static ImageIcon[] animateScratchTop() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(32, 192, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 192, 32, 32)) // inverted but is okay
        };
    }

    public static ImageIcon[] animateScratchBottom() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(96, 192, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 192, 32, 32))
        };
    }

    public static ImageIcon[] animatePrepareToSleep() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(32, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(96, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 0, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(0, 32, 32, 32))
        };
    }

    public static ImageIcon[] animateSleep() {
        BufferedImage x = Neko.settings.getAssetFromSettings("pet");
        return new ImageIcon[]{
                new ImageIcon(nekoAssetsImage.getSubimage(64, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(64, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 32, 32, 32)),
                new ImageIcon(nekoAssetsImage.getSubimage(32, 32, 32, 32))
        };
    }
}

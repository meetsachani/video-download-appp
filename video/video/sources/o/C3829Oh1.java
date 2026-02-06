package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.io.FileNotFoundException;

/* renamed from: o.Oh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3829Oh1 {
    public static final int a = 17;
    public static final int b = 512;
    public static final int c = 384;

    public static boolean a(Uri uri) {
        if (d(uri) && uri.getPathSegments().contains("picker")) {
            return true;
        }
        return false;
    }

    public static boolean b(Uri uri) {
        if (d(uri) && !g(uri)) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion >= 17) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean e(Uri uri) {
        if (d(uri) && g(uri)) {
            return true;
        }
        return false;
    }

    public static boolean f(int i, int i2) {
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            return true;
        }
        return false;
    }

    public static boolean g(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static AssetFileDescriptor h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor;
        openAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
        return openAssetFileDescriptor;
    }
}

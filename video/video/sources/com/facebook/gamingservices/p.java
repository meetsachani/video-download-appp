package com.facebook.gamingservices;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.C0376a;
import com.facebook.S;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public class p {
    public static final String b = "me/photos";
    public Context a;

    public p(Context context) {
        this.a = context;
    }

    public void a(String caption, Bitmap imageBitmap, boolean shouldLaunchMediaDialog) {
        b(caption, imageBitmap, shouldLaunchMediaDialog, null);
    }

    public void b(String caption, Bitmap imageBitmap, boolean shouldLaunchMediaDialog, S.b callback) {
        v vVar;
        C0376a k = C0376a.k();
        if (shouldLaunchMediaDialog) {
            vVar = new v(this.a, callback);
        } else {
            vVar = callback;
        }
        S.b0(k, "me/photos", imageBitmap, caption, null, vVar).n();
    }

    public void c(String caption, Uri imageUri, boolean shouldLaunchMediaDialog) throws FileNotFoundException {
        d(caption, imageUri, shouldLaunchMediaDialog, null);
    }

    public void d(String caption, Uri imageUri, boolean shouldLaunchMediaDialog, S.b callback) throws FileNotFoundException {
        v vVar;
        C0376a k = C0376a.k();
        if (shouldLaunchMediaDialog) {
            vVar = new v(this.a, callback);
        } else {
            vVar = callback;
        }
        S.c0(k, "me/photos", imageUri, caption, null, vVar).n();
    }

    public void e(String caption, File imageFile, boolean shouldLaunchMediaDialog) throws FileNotFoundException {
        f(caption, imageFile, shouldLaunchMediaDialog, null);
    }

    public void f(String caption, File imageFile, boolean shouldLaunchMediaDialog, S.b callback) throws FileNotFoundException {
        v vVar;
        C0376a k = C0376a.k();
        if (shouldLaunchMediaDialog) {
            vVar = new v(this.a, callback);
        } else {
            vVar = callback;
        }
        S.d0(k, "me/photos", imageFile, caption, null, vVar).n();
    }
}

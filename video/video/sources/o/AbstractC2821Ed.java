package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.S;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: o.Ed  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2821Ed {
    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("upload_source", "A2U");
        return bundle;
    }

    public static void b(String title, String body, Bitmap media, int timeInterval, @InterfaceC11300zs1 String payload, S.b callback) throws FileNotFoundException {
        C11137zC0.a(C9998uW1.g, media, a(), new C4414Uh1(title, body, timeInterval, payload, callback));
    }

    public static void c(String title, String body, Uri media, int timeInterval, @InterfaceC11300zs1 String payload, S.b callback) throws FileNotFoundException {
        C11137zC0.b(C9998uW1.g, media, a(), new C4414Uh1(title, body, timeInterval, payload, callback));
    }

    public static void d(String title, String body, File media, int timeInterval, @InterfaceC11300zs1 String payload, S.b callback) throws FileNotFoundException {
        C11137zC0.c(C9998uW1.g, media, a(), new C4414Uh1(title, body, timeInterval, payload, callback));
    }
}

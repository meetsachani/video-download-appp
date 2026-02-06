package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.S;
import java.io.File;
import java.io.FileNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4907Zh
/* renamed from: o.zC0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11137zC0 {
    @NotNull
    public static final C11137zC0 a = new C11137zC0();
    @NotNull
    public static final String b = "me/photos";

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.W a(@Nullable String str, @NotNull Bitmap bitmap, @Nullable Bundle bundle, @Nullable S.b bVar) {
        C6562gT0.p(bitmap, "imageBitmap");
        return com.facebook.S.n.P(C0376a.g1.i(), "me/photos", bitmap, str, bundle, bVar).n();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.W b(@Nullable String str, @NotNull Uri uri, @Nullable Bundle bundle, @Nullable S.b bVar) throws FileNotFoundException {
        C6562gT0.p(uri, "imageUri");
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.d0(uri) && !com.facebook.internal.l0.a0(uri)) {
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putString("url", uri.toString());
            if (str != null && str.length() != 0) {
                bundle2.putString("caption", str);
            }
            return new com.facebook.S(C0376a.g1.i(), "me/photos", bundle2, com.facebook.Z.POST, bVar, null, 32, null).n();
        }
        return com.facebook.S.n.Q(C0376a.g1.i(), "me/photos", uri, str, bundle, bVar).n();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.W c(@Nullable String str, @NotNull File file, @Nullable Bundle bundle, @Nullable S.b bVar) throws FileNotFoundException {
        C6562gT0.p(file, "imageFile");
        return com.facebook.S.n.R(C0376a.g1.i(), "me/photos", file, str, bundle, bVar).n();
    }
}

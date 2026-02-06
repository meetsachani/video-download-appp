package o;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: o.gr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6651gr {
    public static final C6651gr a = new C6651gr();

    @InterfaceC9511sW0
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    @InterfaceC9511sW0
    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}

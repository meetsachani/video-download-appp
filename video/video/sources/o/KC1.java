package o;

import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class KC1 {
    public static final KC1 a = new KC1();

    @InterfaceC9511sW0
    public static final void a(PersistableBundle persistableBundle, String str, boolean z) {
        persistableBundle.putBoolean(str, z);
    }

    @InterfaceC9511sW0
    public static final void b(PersistableBundle persistableBundle, String str, boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}

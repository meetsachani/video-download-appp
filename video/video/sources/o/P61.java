package o;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes4.dex */
public class P61<T> extends FC1<T> {
    public P61(@InterfaceC5670cr1 T t) {
        super(t);
    }

    @Override // o.FC1
    public void a(int i, @InterfaceC5670cr1 String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // o.FC1
    public Context b() {
        if (c() instanceof Activity) {
            return (Context) c();
        }
        if (c() instanceof Fragment) {
            return ((Fragment) c()).v();
        }
        throw new IllegalStateException("Unknown host: " + c());
    }

    @Override // o.FC1
    public boolean i(@InterfaceC5670cr1 String str) {
        return false;
    }

    @Override // o.FC1
    public void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}

package o;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class FC1<T> {
    public T a;

    public FC1(@InterfaceC5670cr1 T t) {
        this.a = t;
    }

    @InterfaceC5670cr1
    public static FC1<? extends Activity> d(Activity activity) {
        if (activity instanceof ActivityC3020Gb) {
            return new C3118Hb((ActivityC3020Gb) activity);
        }
        return new B5(activity);
    }

    @InterfaceC5670cr1
    public static FC1<Fragment> e(Fragment fragment) {
        return new C9310rh2(fragment);
    }

    public abstract void a(int i, @InterfaceC5670cr1 String... strArr);

    public abstract Context b();

    @InterfaceC5670cr1
    public T c() {
        return this.a;
    }

    public boolean f(@InterfaceC5670cr1 String str) {
        return !i(str);
    }

    public void g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String... strArr) {
        if (h(strArr)) {
            j(str, str2, str3, i, i2, strArr);
        } else {
            a(i2, strArr);
        }
    }

    public final boolean h(@InterfaceC5670cr1 String... strArr) {
        for (String str : strArr) {
            if (i(str)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean i(@InterfaceC5670cr1 String str);

    public abstract void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String... strArr);

    public boolean k(@InterfaceC5670cr1 String... strArr) {
        return h(strArr);
    }

    public boolean l(@InterfaceC5670cr1 List<String> list) {
        for (String str : list) {
            if (f(str)) {
                return true;
            }
        }
        return false;
    }
}

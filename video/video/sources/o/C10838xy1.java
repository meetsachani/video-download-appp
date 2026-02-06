package o;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.xy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10838xy1 {
    public static final String a = "a";

    public static <T extends InterfaceC5283bF2> T a(InputStream inputStream) {
        return (T) new C5040aF2(inputStream, null).g0();
    }

    public static <T extends InterfaceC5283bF2> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends InterfaceC5283bF2> T c(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C10838xy1.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static <T extends InterfaceC5283bF2> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(C10838xy1.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(Bundle bundle, String str, InterfaceC5283bF2 interfaceC5283bF2) {
        if (interfaceC5283bF2 == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", h(interfaceC5283bF2));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(Bundle bundle, String str, List<? extends InterfaceC5283bF2> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (InterfaceC5283bF2 interfaceC5283bF2 : list) {
            arrayList.add(h(interfaceC5283bF2));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static void g(InterfaceC5283bF2 interfaceC5283bF2, OutputStream outputStream) {
        C5040aF2 c5040aF2 = new C5040aF2(null, outputStream);
        c5040aF2.l1(interfaceC5283bF2);
        c5040aF2.a();
    }

    public static Parcelable h(InterfaceC5283bF2 interfaceC5283bF2) {
        return new ParcelImpl(interfaceC5283bF2);
    }
}

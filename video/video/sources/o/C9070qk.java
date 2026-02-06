package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.qk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9070qk implements Parcelable {
    public static final Parcelable.Creator<C9070qk> CREATOR = new a();
    public final List<String> X;
    public final List<androidx.fragment.app.b> Y;

    /* renamed from: o.qk$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C9070qk> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9070qk createFromParcel(Parcel parcel) {
            return new C9070qk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9070qk[] newArray(int i) {
            return new C9070qk[i];
        }
    }

    public C9070qk(List<String> list, List<androidx.fragment.app.b> list2) {
        this.X = list;
        this.Y = list2;
    }

    public List<androidx.fragment.app.a> a(FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.X.size());
        for (String str : this.X) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.a1, fragment);
            } else {
                Bundle C = fragmentManager.I0().C(str, null);
                if (C != null) {
                    ClassLoader classLoader = fragmentManager.K0().g().getClassLoader();
                    Fragment a2 = ((C10355vz0) C.getParcelable("state")).a(fragmentManager.H0(), classLoader);
                    a2.Y = C;
                    if (C.getBundle(androidx.fragment.app.h.h) == null) {
                        a2.Y.putBundle(androidx.fragment.app.h.h, new Bundle());
                    }
                    Bundle bundle = C.getBundle(androidx.fragment.app.h.m);
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a2.f2(bundle);
                    hashMap.put(a2.a1, a2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.b bVar : this.Y) {
            arrayList.add(bVar.c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.X);
        parcel.writeTypedList(this.Y);
    }

    public C9070qk(Parcel parcel) {
        this.X = parcel.createStringArrayList();
        this.Y = parcel.createTypedArrayList(androidx.fragment.app.b.CREATOR);
    }
}

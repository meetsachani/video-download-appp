package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j;
import androidx.lifecycle.f;
import java.util.ArrayList;
import java.util.Map;
import o.C9811tl1;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public static final String j1 = "FragmentManager";
    public final int[] X;
    public final ArrayList<String> Y;
    public final int[] Y0;
    public final int[] Z;
    public final int Z0;
    public final String a1;
    public final int b1;
    public final int c1;
    public final CharSequence d1;
    public final int e1;
    public final CharSequence f1;
    public final ArrayList<String> g1;
    public final ArrayList<String> h1;
    public final boolean i1;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.X = new int[size * 6];
        if (aVar.i) {
            this.Y = new ArrayList<>(size);
            this.Z = new int[size];
            this.Y0 = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                j.a aVar2 = aVar.c.get(i2);
                int i3 = i + 1;
                this.X[i] = aVar2.a;
                ArrayList<String> arrayList = this.Y;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.a1 : null);
                int[] iArr = this.X;
                iArr[i3] = aVar2.c ? 1 : 0;
                iArr[i + 2] = aVar2.d;
                iArr[i + 3] = aVar2.e;
                int i4 = i + 5;
                iArr[i + 4] = aVar2.f;
                i += 6;
                iArr[i4] = aVar2.g;
                this.Z[i2] = aVar2.h.ordinal();
                this.Y0[i2] = aVar2.i.ordinal();
            }
            this.Z0 = aVar.h;
            this.a1 = aVar.k;
            this.b1 = aVar.P;
            this.c1 = aVar.l;
            this.d1 = aVar.m;
            this.e1 = aVar.n;
            this.f1 = aVar.f34o;
            this.g1 = aVar.p;
            this.h1 = aVar.q;
            this.i1 = aVar.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.X.length) {
                j.a aVar2 = new j.a();
                int i3 = i + 1;
                aVar2.a = this.X[i];
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.X[i3]);
                }
                aVar2.h = f.b.values()[this.Z[i2]];
                aVar2.i = f.b.values()[this.Y0[i2]];
                int[] iArr = this.X;
                int i4 = i + 2;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.c = z;
                int i5 = iArr[i4];
                aVar2.d = i5;
                int i6 = iArr[i + 3];
                aVar2.e = i6;
                int i7 = i + 5;
                int i8 = iArr[i + 4];
                aVar2.f = i8;
                i += 6;
                int i9 = iArr[i7];
                aVar2.g = i9;
                aVar.d = i5;
                aVar.e = i6;
                aVar.f = i8;
                aVar.g = i9;
                aVar.i(aVar2);
                i2++;
            } else {
                aVar.h = this.Z0;
                aVar.k = this.a1;
                aVar.i = true;
                aVar.l = this.c1;
                aVar.m = this.d1;
                aVar.n = this.e1;
                aVar.f34o = this.f1;
                aVar.p = this.g1;
                aVar.q = this.h1;
                aVar.r = this.i1;
                return;
            }
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.P = this.b1;
        for (int i = 0; i < this.Y.size(); i++) {
            String str = this.Y.get(i);
            if (str != null) {
                aVar.c.get(i).b = fragmentManager.o0(str);
            }
        }
        aVar.Q(1);
        return aVar;
    }

    public androidx.fragment.app.a c(FragmentManager fragmentManager, Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i = 0; i < this.Y.size(); i++) {
            String str = this.Y.get(i);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    aVar.c.get(i).b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.a1 + " failed due to missing saved state for Fragment (" + str + C9811tl1.d);
                }
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeIntArray(this.Z);
        parcel.writeIntArray(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeString(this.a1);
        parcel.writeInt(this.b1);
        parcel.writeInt(this.c1);
        TextUtils.writeToParcel(this.d1, parcel, 0);
        parcel.writeInt(this.e1);
        TextUtils.writeToParcel(this.f1, parcel, 0);
        parcel.writeStringList(this.g1);
        parcel.writeStringList(this.h1);
        parcel.writeInt(this.i1 ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.X = parcel.createIntArray();
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createIntArray();
        this.Y0 = parcel.createIntArray();
        this.Z0 = parcel.readInt();
        this.a1 = parcel.readString();
        this.b1 = parcel.readInt();
        this.c1 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.d1 = (CharSequence) creator.createFromParcel(parcel);
        this.e1 = parcel.readInt();
        this.f1 = (CharSequence) creator.createFromParcel(parcel);
        this.g1 = parcel.createStringArrayList();
        this.h1 = parcel.createStringArrayList();
        this.i1 = parcel.readInt() != 0;
    }
}

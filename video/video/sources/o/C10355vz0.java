package o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;

/* renamed from: o.vz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10355vz0 implements Parcelable {
    public static final Parcelable.Creator<C10355vz0> CREATOR = new a();
    public final String X;
    public final String Y;
    public final int Y0;
    public final boolean Z;
    public final int Z0;
    public final String a1;
    public final boolean b1;
    public final boolean c1;
    public final boolean d1;
    public final boolean e1;
    public final int f1;
    public final String g1;
    public final int h1;
    public final boolean i1;

    /* renamed from: o.vz0$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C10355vz0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C10355vz0 createFromParcel(Parcel parcel) {
            return new C10355vz0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C10355vz0[] newArray(int i) {
            return new C10355vz0[i];
        }
    }

    public C10355vz0(Fragment fragment) {
        this.X = fragment.getClass().getName();
        this.Y = fragment.a1;
        this.Z = fragment.j1;
        this.Y0 = fragment.s1;
        this.Z0 = fragment.t1;
        this.a1 = fragment.u1;
        this.b1 = fragment.x1;
        this.c1 = fragment.h1;
        this.d1 = fragment.w1;
        this.e1 = fragment.v1;
        this.f1 = fragment.N1.ordinal();
        this.g1 = fragment.d1;
        this.h1 = fragment.e1;
        this.i1 = fragment.F1;
    }

    public Fragment a(androidx.fragment.app.e eVar, ClassLoader classLoader) {
        Fragment a2 = eVar.a(classLoader, this.X);
        a2.a1 = this.Y;
        a2.j1 = this.Z;
        a2.l1 = true;
        a2.s1 = this.Y0;
        a2.t1 = this.Z0;
        a2.u1 = this.a1;
        a2.x1 = this.b1;
        a2.h1 = this.c1;
        a2.w1 = this.d1;
        a2.v1 = this.e1;
        a2.N1 = f.b.values()[this.f1];
        a2.d1 = this.g1;
        a2.e1 = this.h1;
        a2.F1 = this.i1;
        return a2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.X);
        sb.append(" (");
        sb.append(this.Y);
        sb.append(")}:");
        if (this.Z) {
            sb.append(" fromLayout");
        }
        if (this.Z0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.Z0));
        }
        String str = this.a1;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.a1);
        }
        if (this.b1) {
            sb.append(" retainInstance");
        }
        if (this.c1) {
            sb.append(" removing");
        }
        if (this.d1) {
            sb.append(" detached");
        }
        if (this.e1) {
            sb.append(" hidden");
        }
        if (this.g1 != null) {
            sb.append(" targetWho=");
            sb.append(this.g1);
            sb.append(" targetRequestCode=");
            sb.append(this.h1);
        }
        if (this.i1) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeString(this.a1);
        parcel.writeInt(this.b1 ? 1 : 0);
        parcel.writeInt(this.c1 ? 1 : 0);
        parcel.writeInt(this.d1 ? 1 : 0);
        parcel.writeInt(this.e1 ? 1 : 0);
        parcel.writeInt(this.f1);
        parcel.writeString(this.g1);
        parcel.writeInt(this.h1);
        parcel.writeInt(this.i1 ? 1 : 0);
    }

    public C10355vz0(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt() != 0;
        this.Y0 = parcel.readInt();
        this.Z0 = parcel.readInt();
        this.a1 = parcel.readString();
        this.b1 = parcel.readInt() != 0;
        this.c1 = parcel.readInt() != 0;
        this.d1 = parcel.readInt() != 0;
        this.e1 = parcel.readInt() != 0;
        this.f1 = parcel.readInt();
        this.g1 = parcel.readString();
        this.h1 = parcel.readInt();
        this.i1 = parcel.readInt() != 0;
    }
}

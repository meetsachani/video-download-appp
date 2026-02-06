package o;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C7025iN1;

/* renamed from: o.Oo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3858Oo2 implements Parcelable {
    public static final Parcelable.Creator<C3858Oo2> CREATOR = new a();
    public static final String c1 = "%02d";
    public static final String d1 = "%d";
    public final C11240zd1 X;
    public final C11240zd1 Y;
    public int Y0;
    public final int Z;
    public int Z0;
    public int a1;
    public int b1;

    /* renamed from: o.Oo2$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<C3858Oo2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C3858Oo2 createFromParcel(Parcel parcel) {
            return new C3858Oo2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C3858Oo2[] newArray(int i) {
            return new C3858Oo2[i];
        }
    }

    public C3858Oo2() {
        this(0);
    }

    @InterfaceC11300zs1
    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, c1);
    }

    @InterfaceC11300zs1
    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i) {
        if (i >= 12) {
            return 1;
        }
        return 0;
    }

    @InterfaceC3329Je2
    public int c() {
        if (this.Z == 1) {
            return C7025iN1.m.material_hour_24h_suffix;
        }
        return C7025iN1.m.material_hour_suffix;
    }

    public int d() {
        if (this.Z == 1) {
            return this.Y0 % 24;
        }
        int i = this.Y0;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.b1 == 1) {
            return i - 12;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C11240zd1 e() {
        return this.Y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3858Oo2)) {
            return false;
        }
        C3858Oo2 c3858Oo2 = (C3858Oo2) obj;
        if (this.Y0 == c3858Oo2.Y0 && this.Z0 == c3858Oo2.Z0 && this.Z == c3858Oo2.Z && this.a1 == c3858Oo2.a1) {
            return true;
        }
        return false;
    }

    public C11240zd1 f() {
        return this.X;
    }

    public void h(int i) {
        if (this.Z == 1) {
            this.Y0 = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.b1 != 1) {
            i2 = 0;
        }
        this.Y0 = i3 + i2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Z), Integer.valueOf(this.Y0), Integer.valueOf(this.Z0), Integer.valueOf(this.a1)});
    }

    public void k(int i) {
        this.b1 = g(i);
        this.Y0 = i;
    }

    public void m(@BR0(from = 0, to = 59) int i) {
        this.Z0 = i % 60;
    }

    public void n(int i) {
        if (i != this.b1) {
            this.b1 = i;
            int i2 = this.Y0;
            if (i2 < 12 && i == 1) {
                this.Y0 = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.Y0 = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeInt(this.a1);
        parcel.writeInt(this.Z);
    }

    public C3858Oo2(int i) {
        this(0, 0, 10, i);
    }

    public C3858Oo2(int i, int i2, int i3, int i4) {
        this.Y0 = i;
        this.Z0 = i2;
        this.a1 = i3;
        this.Z = i4;
        this.b1 = g(i);
        this.X = new C11240zd1(59);
        this.Y = new C11240zd1(i4 == 1 ? 23 : 12);
    }

    public C3858Oo2(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

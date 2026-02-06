package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Locale;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Ck  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2653Ck {
    public static final String m = "badge";
    public final a a;
    public final a b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public int k;
    public int l;

    public C2653Ck(Context context, @XN2 int i, @InterfaceC8568og int i2, @InterfaceC4698Xf2 int i3, @InterfaceC11300zs1 a aVar) {
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int i7;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        boolean booleanValue;
        a aVar2 = new a();
        this.b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i != 0) {
            aVar.X = i;
        }
        TypedArray c = c(context, aVar.X, i2, i3);
        Resources resources = context.getResources();
        this.c = c.getDimensionPixelSize(C7025iN1.o.z, -1);
        this.i = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_badge_text_horizontal_edge_offset);
        this.d = c.getDimensionPixelSize(C7025iN1.o.J, -1);
        int i8 = C7025iN1.o.H;
        int i9 = C7025iN1.f.m3_badge_size;
        this.e = c.getDimension(i8, resources.getDimension(i9));
        int i10 = C7025iN1.o.M;
        int i11 = C7025iN1.f.m3_badge_with_text_size;
        this.g = c.getDimension(i10, resources.getDimension(i11));
        this.f = c.getDimension(C7025iN1.o.y, resources.getDimension(i9));
        this.h = c.getDimension(C7025iN1.o.I, resources.getDimension(i11));
        boolean z = true;
        this.k = c.getInt(C7025iN1.o.T, 1);
        this.l = c.getInt(C7025iN1.o.w, 0);
        aVar2.d1 = aVar.d1 == -2 ? 255 : aVar.d1;
        if (aVar.f1 != -2) {
            aVar2.f1 = aVar.f1;
        } else {
            int i12 = C7025iN1.o.S;
            if (c.hasValue(i12)) {
                aVar2.f1 = c.getInt(i12, 0);
            } else {
                aVar2.f1 = -1;
            }
        }
        if (aVar.e1 != null) {
            aVar2.e1 = aVar.e1;
        } else {
            int i13 = C7025iN1.o.C;
            if (c.hasValue(i13)) {
                aVar2.e1 = c.getString(i13);
            }
        }
        aVar2.j1 = aVar.j1;
        if (aVar.k1 != null) {
            charSequence = aVar.k1;
        } else {
            charSequence = context.getString(C7025iN1.m.mtrl_badge_numberless_content_description);
        }
        aVar2.k1 = charSequence;
        if (aVar.l1 != 0) {
            i4 = aVar.l1;
        } else {
            i4 = C7025iN1.l.mtrl_badge_content_description;
        }
        aVar2.l1 = i4;
        if (aVar.m1 != 0) {
            i5 = aVar.m1;
        } else {
            i5 = C7025iN1.m.mtrl_exceed_max_badge_number_content_description;
        }
        aVar2.m1 = i5;
        if (aVar.o1 != null && !aVar.o1.booleanValue()) {
            z = false;
        }
        aVar2.o1 = Boolean.valueOf(z);
        if (aVar.g1 != -2) {
            i6 = aVar.g1;
        } else {
            i6 = c.getInt(C7025iN1.o.Q, -2);
        }
        aVar2.g1 = i6;
        if (aVar.h1 != -2) {
            i7 = aVar.h1;
        } else {
            i7 = c.getInt(C7025iN1.o.R, -2);
        }
        aVar2.h1 = i7;
        if (aVar.Z0 != null) {
            intValue = aVar.Z0.intValue();
        } else {
            intValue = c.getResourceId(C7025iN1.o.A, C7025iN1.n.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        aVar2.Z0 = Integer.valueOf(intValue);
        if (aVar.a1 != null) {
            intValue2 = aVar.a1.intValue();
        } else {
            intValue2 = c.getResourceId(C7025iN1.o.B, 0);
        }
        aVar2.a1 = Integer.valueOf(intValue2);
        if (aVar.b1 != null) {
            intValue3 = aVar.b1.intValue();
        } else {
            intValue3 = c.getResourceId(C7025iN1.o.K, C7025iN1.n.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        aVar2.b1 = Integer.valueOf(intValue3);
        if (aVar.c1 != null) {
            intValue4 = aVar.c1.intValue();
        } else {
            intValue4 = c.getResourceId(C7025iN1.o.L, 0);
        }
        aVar2.c1 = Integer.valueOf(intValue4);
        if (aVar.Y != null) {
            intValue5 = aVar.Y.intValue();
        } else {
            intValue5 = J(context, c, C7025iN1.o.v);
        }
        aVar2.Y = Integer.valueOf(intValue5);
        if (aVar.Y0 != null) {
            intValue6 = aVar.Y0.intValue();
        } else {
            intValue6 = c.getResourceId(C7025iN1.o.D, C7025iN1.n.TextAppearance_MaterialComponents_Badge);
        }
        aVar2.Y0 = Integer.valueOf(intValue6);
        if (aVar.Z != null) {
            aVar2.Z = aVar.Z;
        } else {
            int i14 = C7025iN1.o.E;
            if (c.hasValue(i14)) {
                aVar2.Z = Integer.valueOf(J(context, c, i14));
            } else {
                aVar2.Z = Integer.valueOf(new C9081qm2(context, aVar2.Y0.intValue()).k().getDefaultColor());
            }
        }
        if (aVar.n1 != null) {
            intValue7 = aVar.n1.intValue();
        } else {
            intValue7 = c.getInt(C7025iN1.o.x, 8388661);
        }
        aVar2.n1 = Integer.valueOf(intValue7);
        if (aVar.p1 != null) {
            intValue8 = aVar.p1.intValue();
        } else {
            intValue8 = c.getDimensionPixelSize(C7025iN1.o.G, resources.getDimensionPixelSize(C7025iN1.f.mtrl_badge_long_text_horizontal_padding));
        }
        aVar2.p1 = Integer.valueOf(intValue8);
        if (aVar.q1 != null) {
            intValue9 = aVar.q1.intValue();
        } else {
            intValue9 = c.getDimensionPixelSize(C7025iN1.o.F, resources.getDimensionPixelSize(C7025iN1.f.m3_badge_with_text_vertical_padding));
        }
        aVar2.q1 = Integer.valueOf(intValue9);
        if (aVar.r1 != null) {
            intValue10 = aVar.r1.intValue();
        } else {
            intValue10 = c.getDimensionPixelOffset(C7025iN1.o.N, 0);
        }
        aVar2.r1 = Integer.valueOf(intValue10);
        if (aVar.s1 != null) {
            intValue11 = aVar.s1.intValue();
        } else {
            intValue11 = c.getDimensionPixelOffset(C7025iN1.o.U, 0);
        }
        aVar2.s1 = Integer.valueOf(intValue11);
        if (aVar.t1 != null) {
            intValue12 = aVar.t1.intValue();
        } else {
            intValue12 = c.getDimensionPixelOffset(C7025iN1.o.O, aVar2.r1.intValue());
        }
        aVar2.t1 = Integer.valueOf(intValue12);
        if (aVar.u1 != null) {
            intValue13 = aVar.u1.intValue();
        } else {
            intValue13 = c.getDimensionPixelOffset(C7025iN1.o.V, aVar2.s1.intValue());
        }
        aVar2.u1 = Integer.valueOf(intValue13);
        if (aVar.x1 != null) {
            intValue14 = aVar.x1.intValue();
        } else {
            intValue14 = c.getDimensionPixelOffset(C7025iN1.o.P, 0);
        }
        aVar2.x1 = Integer.valueOf(intValue14);
        aVar2.v1 = Integer.valueOf(aVar.v1 == null ? 0 : aVar.v1.intValue());
        aVar2.w1 = Integer.valueOf(aVar.w1 == null ? 0 : aVar.w1.intValue());
        if (aVar.y1 != null) {
            booleanValue = aVar.y1.booleanValue();
        } else {
            booleanValue = c.getBoolean(C7025iN1.o.u, false);
        }
        aVar2.y1 = Boolean.valueOf(booleanValue);
        c.recycle();
        if (aVar.i1 == null) {
            aVar2.i1 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.i1 = aVar.i1;
        }
        this.a = aVar;
    }

    public static int J(Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        return C4297Tc1.a(context, typedArray, i).getDefaultColor();
    }

    public a A() {
        return this.a;
    }

    public String B() {
        return this.b.e1;
    }

    @InterfaceC4698Xf2
    public int C() {
        return this.b.Y0.intValue();
    }

    @InterfaceC9397s30(unit = 1)
    public int D() {
        return this.b.u1.intValue();
    }

    @InterfaceC9397s30(unit = 1)
    public int E() {
        return this.b.s1.intValue();
    }

    public boolean F() {
        if (this.b.f1 != -1) {
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.b.e1 != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean H() {
        return this.b.y1.booleanValue();
    }

    public boolean I() {
        return this.b.o1.booleanValue();
    }

    public void K(@InterfaceC9397s30(unit = 1) int i) {
        this.a.v1 = Integer.valueOf(i);
        this.b.v1 = Integer.valueOf(i);
    }

    public void L(@InterfaceC9397s30(unit = 1) int i) {
        this.a.w1 = Integer.valueOf(i);
        this.b.w1 = Integer.valueOf(i);
    }

    public void M(int i) {
        this.a.d1 = i;
        this.b.d1 = i;
    }

    @Deprecated
    public void N(boolean z) {
        this.a.y1 = Boolean.valueOf(z);
        this.b.y1 = Boolean.valueOf(z);
    }

    public void O(@JF int i) {
        this.a.Y = Integer.valueOf(i);
        this.b.Y = Integer.valueOf(i);
    }

    public void P(int i) {
        this.a.n1 = Integer.valueOf(i);
        this.b.n1 = Integer.valueOf(i);
    }

    public void Q(@PK1 int i) {
        this.a.p1 = Integer.valueOf(i);
        this.b.p1 = Integer.valueOf(i);
    }

    public void R(int i) {
        this.a.a1 = Integer.valueOf(i);
        this.b.a1 = Integer.valueOf(i);
    }

    public void S(int i) {
        this.a.Z0 = Integer.valueOf(i);
        this.b.Z0 = Integer.valueOf(i);
    }

    public void T(@JF int i) {
        this.a.Z = Integer.valueOf(i);
        this.b.Z = Integer.valueOf(i);
    }

    public void U(@PK1 int i) {
        this.a.q1 = Integer.valueOf(i);
        this.b.q1 = Integer.valueOf(i);
    }

    public void V(int i) {
        this.a.c1 = Integer.valueOf(i);
        this.b.c1 = Integer.valueOf(i);
    }

    public void W(int i) {
        this.a.b1 = Integer.valueOf(i);
        this.b.b1 = Integer.valueOf(i);
    }

    public void X(@InterfaceC3329Je2 int i) {
        this.a.m1 = i;
        this.b.m1 = i;
    }

    public void Y(CharSequence charSequence) {
        this.a.j1 = charSequence;
        this.b.j1 = charSequence;
    }

    public void Z(CharSequence charSequence) {
        this.a.k1 = charSequence;
        this.b.k1 = charSequence;
    }

    public void a() {
        g0(-1);
    }

    public void a0(@RD1 int i) {
        this.a.l1 = i;
        this.b.l1 = i;
    }

    public void b() {
        i0(null);
    }

    public void b0(@InterfaceC9397s30(unit = 1) int i) {
        this.a.t1 = Integer.valueOf(i);
        this.b.t1 = Integer.valueOf(i);
    }

    public final TypedArray c(Context context, @XN2 int i, @InterfaceC8568og int i2, @InterfaceC4698Xf2 int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            attributeSet = Z60.k(context, i, m);
            i4 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i4 = 0;
        }
        AttributeSet attributeSet2 = attributeSet;
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return C7608kn2.k(context, attributeSet2, C7025iN1.o.t, i2, i5, new int[0]);
    }

    public void c0(@InterfaceC9397s30(unit = 1) int i) {
        this.a.r1 = Integer.valueOf(i);
        this.b.r1 = Integer.valueOf(i);
    }

    @InterfaceC9397s30(unit = 1)
    public int d() {
        return this.b.v1.intValue();
    }

    public void d0(@InterfaceC9397s30(unit = 1) int i) {
        this.a.x1 = Integer.valueOf(i);
        this.b.x1 = Integer.valueOf(i);
    }

    @InterfaceC9397s30(unit = 1)
    public int e() {
        return this.b.w1.intValue();
    }

    public void e0(int i) {
        this.a.g1 = i;
        this.b.g1 = i;
    }

    public int f() {
        return this.b.d1;
    }

    public void f0(int i) {
        this.a.h1 = i;
        this.b.h1 = i;
    }

    @JF
    public int g() {
        return this.b.Y.intValue();
    }

    public void g0(int i) {
        this.a.f1 = i;
        this.b.f1 = i;
    }

    public int h() {
        return this.b.n1.intValue();
    }

    public void h0(Locale locale) {
        this.a.i1 = locale;
        this.b.i1 = locale;
    }

    @PK1
    public int i() {
        return this.b.p1.intValue();
    }

    public void i0(String str) {
        this.a.e1 = str;
        this.b.e1 = str;
    }

    public int j() {
        return this.b.a1.intValue();
    }

    public void j0(@InterfaceC4698Xf2 int i) {
        this.a.Y0 = Integer.valueOf(i);
        this.b.Y0 = Integer.valueOf(i);
    }

    public int k() {
        return this.b.Z0.intValue();
    }

    public void k0(@InterfaceC9397s30(unit = 1) int i) {
        this.a.u1 = Integer.valueOf(i);
        this.b.u1 = Integer.valueOf(i);
    }

    @JF
    public int l() {
        return this.b.Z.intValue();
    }

    public void l0(@InterfaceC9397s30(unit = 1) int i) {
        this.a.s1 = Integer.valueOf(i);
        this.b.s1 = Integer.valueOf(i);
    }

    @PK1
    public int m() {
        return this.b.q1.intValue();
    }

    public void m0(boolean z) {
        this.a.o1 = Boolean.valueOf(z);
        this.b.o1 = Boolean.valueOf(z);
    }

    public int n() {
        return this.b.c1.intValue();
    }

    public int o() {
        return this.b.b1.intValue();
    }

    @InterfaceC3329Je2
    public int p() {
        return this.b.m1;
    }

    public CharSequence q() {
        return this.b.j1;
    }

    public CharSequence r() {
        return this.b.k1;
    }

    @RD1
    public int s() {
        return this.b.l1;
    }

    @InterfaceC9397s30(unit = 1)
    public int t() {
        return this.b.t1.intValue();
    }

    @InterfaceC9397s30(unit = 1)
    public int u() {
        return this.b.r1.intValue();
    }

    @InterfaceC9397s30(unit = 1)
    public int v() {
        return this.b.x1.intValue();
    }

    public int w() {
        return this.b.g1;
    }

    public int x() {
        return this.b.h1;
    }

    public int y() {
        return this.b.f1;
    }

    public Locale z() {
        return this.b.i1;
    }

    /* renamed from: o.Ck$a */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable {
        public static final int A1 = -1;
        public static final int B1 = -2;
        public static final Parcelable.Creator<a> CREATOR = new C0169a();
        @XN2
        public int X;
        @JF
        public Integer Y;
        @InterfaceC4698Xf2
        public Integer Y0;
        @JF
        public Integer Z;
        @InterfaceC4698Xf2
        public Integer Z0;
        @InterfaceC4698Xf2
        public Integer a1;
        @InterfaceC4698Xf2
        public Integer b1;
        @InterfaceC4698Xf2
        public Integer c1;
        public int d1;
        @InterfaceC11300zs1
        public String e1;
        public int f1;
        public int g1;
        public int h1;
        public Locale i1;
        @InterfaceC11300zs1
        public CharSequence j1;
        @InterfaceC11300zs1
        public CharSequence k1;
        @RD1
        public int l1;
        @InterfaceC3329Je2
        public int m1;
        public Integer n1;
        public Boolean o1;
        @PK1
        public Integer p1;
        @PK1
        public Integer q1;
        @InterfaceC9397s30(unit = 1)
        public Integer r1;
        @InterfaceC9397s30(unit = 1)
        public Integer s1;
        @InterfaceC9397s30(unit = 1)
        public Integer t1;
        @InterfaceC9397s30(unit = 1)
        public Integer u1;
        @InterfaceC9397s30(unit = 1)
        public Integer v1;
        @InterfaceC9397s30(unit = 1)
        public Integer w1;
        @InterfaceC9397s30(unit = 1)
        public Integer x1;
        public Boolean y1;
        public Integer z1;

        /* renamed from: o.Ck$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0169a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: a */
            public a createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            this.d1 = 255;
            this.f1 = -2;
            this.g1 = -2;
            this.h1 = -2;
            this.o1 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.X);
            parcel.writeSerializable(this.Y);
            parcel.writeSerializable(this.Z);
            parcel.writeSerializable(this.Y0);
            parcel.writeSerializable(this.Z0);
            parcel.writeSerializable(this.a1);
            parcel.writeSerializable(this.b1);
            parcel.writeSerializable(this.c1);
            parcel.writeInt(this.d1);
            parcel.writeString(this.e1);
            parcel.writeInt(this.f1);
            parcel.writeInt(this.g1);
            parcel.writeInt(this.h1);
            CharSequence charSequence = this.j1;
            String str2 = null;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            CharSequence charSequence2 = this.k1;
            if (charSequence2 != null) {
                str2 = charSequence2.toString();
            }
            parcel.writeString(str2);
            parcel.writeInt(this.l1);
            parcel.writeSerializable(this.n1);
            parcel.writeSerializable(this.p1);
            parcel.writeSerializable(this.q1);
            parcel.writeSerializable(this.r1);
            parcel.writeSerializable(this.s1);
            parcel.writeSerializable(this.t1);
            parcel.writeSerializable(this.u1);
            parcel.writeSerializable(this.x1);
            parcel.writeSerializable(this.v1);
            parcel.writeSerializable(this.w1);
            parcel.writeSerializable(this.o1);
            parcel.writeSerializable(this.i1);
            parcel.writeSerializable(this.y1);
            parcel.writeSerializable(this.z1);
        }

        public a(@InterfaceC5670cr1 Parcel parcel) {
            this.d1 = 255;
            this.f1 = -2;
            this.g1 = -2;
            this.h1 = -2;
            this.o1 = Boolean.TRUE;
            this.X = parcel.readInt();
            this.Y = (Integer) parcel.readSerializable();
            this.Z = (Integer) parcel.readSerializable();
            this.Y0 = (Integer) parcel.readSerializable();
            this.Z0 = (Integer) parcel.readSerializable();
            this.a1 = (Integer) parcel.readSerializable();
            this.b1 = (Integer) parcel.readSerializable();
            this.c1 = (Integer) parcel.readSerializable();
            this.d1 = parcel.readInt();
            this.e1 = parcel.readString();
            this.f1 = parcel.readInt();
            this.g1 = parcel.readInt();
            this.h1 = parcel.readInt();
            this.j1 = parcel.readString();
            this.k1 = parcel.readString();
            this.l1 = parcel.readInt();
            this.n1 = (Integer) parcel.readSerializable();
            this.p1 = (Integer) parcel.readSerializable();
            this.q1 = (Integer) parcel.readSerializable();
            this.r1 = (Integer) parcel.readSerializable();
            this.s1 = (Integer) parcel.readSerializable();
            this.t1 = (Integer) parcel.readSerializable();
            this.u1 = (Integer) parcel.readSerializable();
            this.x1 = (Integer) parcel.readSerializable();
            this.v1 = (Integer) parcel.readSerializable();
            this.w1 = (Integer) parcel.readSerializable();
            this.o1 = (Boolean) parcel.readSerializable();
            this.i1 = (Locale) parcel.readSerializable();
            this.y1 = (Boolean) parcel.readSerializable();
            this.z1 = (Integer) parcel.readSerializable();
        }
    }
}

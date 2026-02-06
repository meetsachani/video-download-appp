package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;
import o.C11143zD2;
import o.C2691Ct1;
import o.C3548Lk1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0124a();
    @InterfaceC5670cr1
    public final C3548Lk1 X;
    @InterfaceC5670cr1
    public final C3548Lk1 Y;
    @InterfaceC11300zs1
    public C3548Lk1 Y0;
    @InterfaceC5670cr1
    public final c Z;
    public final int Z0;
    public final int a1;
    public final int b1;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0124a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public a createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return new a((C3548Lk1) parcel.readParcelable(C3548Lk1.class.getClassLoader()), (C3548Lk1) parcel.readParcelable(C3548Lk1.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C3548Lk1) parcel.readParcelable(C3548Lk1.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes3.dex */
    public interface c extends Parcelable {
        boolean M(long j);
    }

    public /* synthetic */ a(C3548Lk1 c3548Lk1, C3548Lk1 c3548Lk12, c cVar, C3548Lk1 c3548Lk13, int i, C0124a c0124a) {
        this(c3548Lk1, c3548Lk12, cVar, c3548Lk13, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.X.equals(aVar.X) && this.Y.equals(aVar.Y) && C2691Ct1.a(this.Y0, aVar.Y0) && this.Z0 == aVar.Z0 && this.Z.equals(aVar.Z)) {
            return true;
        }
        return false;
    }

    public C3548Lk1 f(C3548Lk1 c3548Lk1) {
        if (c3548Lk1.compareTo(this.X) < 0) {
            return this.X;
        }
        if (c3548Lk1.compareTo(this.Y) > 0) {
            return this.Y;
        }
        return c3548Lk1;
    }

    public c g() {
        return this.Z;
    }

    @InterfaceC5670cr1
    public C3548Lk1 h() {
        return this.Y;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Y0, Integer.valueOf(this.Z0), this.Z});
    }

    public long k() {
        return this.Y.a1;
    }

    public int m() {
        return this.Z0;
    }

    public int n() {
        return this.b1;
    }

    @InterfaceC11300zs1
    public C3548Lk1 o() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    public Long q() {
        C3548Lk1 c3548Lk1 = this.Y0;
        if (c3548Lk1 == null) {
            return null;
        }
        return Long.valueOf(c3548Lk1.a1);
    }

    @InterfaceC5670cr1
    public C3548Lk1 s() {
        return this.X;
    }

    public long t() {
        return this.X.a1;
    }

    public int u() {
        return this.a1;
    }

    public boolean v(long j) {
        if (this.X.o(1) <= j) {
            C3548Lk1 c3548Lk1 = this.Y;
            if (j <= c3548Lk1.o(c3548Lk1.Z0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void w(@InterfaceC11300zs1 C3548Lk1 c3548Lk1) {
        this.Y0 = c3548Lk1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.Y, 0);
        parcel.writeParcelable(this.Y0, 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeInt(this.Z0);
    }

    public a(@InterfaceC5670cr1 C3548Lk1 c3548Lk1, @InterfaceC5670cr1 C3548Lk1 c3548Lk12, @InterfaceC5670cr1 c cVar, @InterfaceC11300zs1 C3548Lk1 c3548Lk13, int i) {
        Objects.requireNonNull(c3548Lk1, "start cannot be null");
        Objects.requireNonNull(c3548Lk12, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.X = c3548Lk1;
        this.Y = c3548Lk12;
        this.Y0 = c3548Lk13;
        this.Z0 = i;
        this.Z = cVar;
        if (c3548Lk13 != null && c3548Lk1.compareTo(c3548Lk13) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c3548Lk13 != null && c3548Lk13.compareTo(c3548Lk12) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= C11143zD2.x().getMaximum(7)) {
            this.b1 = c3548Lk1.v(c3548Lk12) + 1;
            this.a1 = (c3548Lk12.Z - c3548Lk1.Z) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static final long f = C11143zD2.a(C3548Lk1.g(1900, 0).a1);
        public static final long g = C11143zD2.a(C3548Lk1.g(AdError.BROKEN_MEDIA_ERROR_CODE, 11).a1);
        public static final String h = "DEEP_COPY_VALIDATOR_KEY";
        public long a;
        public long b;
        public Long c;
        public int d;
        public c e;

        public b() {
            this.a = f;
            this.b = g;
            this.e = e.a(Long.MIN_VALUE);
        }

        @InterfaceC5670cr1
        public a a() {
            C3548Lk1 h2;
            Bundle bundle = new Bundle();
            bundle.putParcelable(h, this.e);
            C3548Lk1 h3 = C3548Lk1.h(this.a);
            C3548Lk1 h4 = C3548Lk1.h(this.b);
            c cVar = (c) bundle.getParcelable(h);
            Long l = this.c;
            if (l == null) {
                h2 = null;
            } else {
                h2 = C3548Lk1.h(l.longValue());
            }
            return new a(h3, h4, cVar, h2, this.d, null);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b b(long j) {
            this.b = j;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b c(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b e(long j) {
            this.a = j;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b f(@InterfaceC5670cr1 c cVar) {
            Objects.requireNonNull(cVar, "validator cannot be null");
            this.e = cVar;
            return this;
        }

        public b(@InterfaceC5670cr1 a aVar) {
            this.a = f;
            this.b = g;
            this.e = e.a(Long.MIN_VALUE);
            this.a = aVar.X.a1;
            this.b = aVar.Y.a1;
            this.c = Long.valueOf(aVar.Y0.a1);
            this.d = aVar.Z0;
            this.e = aVar.Z;
        }
    }
}

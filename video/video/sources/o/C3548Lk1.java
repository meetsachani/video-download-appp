package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: o.Lk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3548Lk1 implements Comparable<C3548Lk1>, Parcelable {
    public static final Parcelable.Creator<C3548Lk1> CREATOR = new a();
    @InterfaceC5670cr1
    public final Calendar X;
    public final int Y;
    public final int Y0;
    public final int Z;
    public final int Z0;
    public final long a1;
    @InterfaceC11300zs1
    public String b1;

    /* renamed from: o.Lk1$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<C3548Lk1> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public C3548Lk1 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return C3548Lk1.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C3548Lk1[] newArray(int i) {
            return new C3548Lk1[i];
        }
    }

    public C3548Lk1(@InterfaceC5670cr1 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = C11143zD2.f(calendar);
        this.X = f;
        this.Y = f.get(2);
        this.Z = f.get(1);
        this.Y0 = f.getMaximum(7);
        this.Z0 = f.getActualMaximum(5);
        this.a1 = f.getTimeInMillis();
    }

    @InterfaceC5670cr1
    public static C3548Lk1 g(int i, int i2) {
        Calendar x = C11143zD2.x();
        x.set(1, i);
        x.set(2, i2);
        return new C3548Lk1(x);
    }

    @InterfaceC5670cr1
    public static C3548Lk1 h(long j) {
        Calendar x = C11143zD2.x();
        x.setTimeInMillis(j);
        return new C3548Lk1(x);
    }

    @InterfaceC5670cr1
    public static C3548Lk1 m() {
        return new C3548Lk1(C11143zD2.v());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(@InterfaceC5670cr1 C3548Lk1 c3548Lk1) {
        return this.X.compareTo(c3548Lk1.X);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3548Lk1)) {
            return false;
        }
        C3548Lk1 c3548Lk1 = (C3548Lk1) obj;
        if (this.Y == c3548Lk1.Y && this.Z == c3548Lk1.Z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Y), Integer.valueOf(this.Z)});
    }

    public int n(int i) {
        int i2 = this.X.get(7);
        if (i <= 0) {
            i = this.X.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + this.Y0;
        }
        return i3;
    }

    public long o(int i) {
        Calendar f = C11143zD2.f(this.X);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public int q(long j) {
        Calendar f = C11143zD2.f(this.X);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    @InterfaceC5670cr1
    public String s() {
        if (this.b1 == null) {
            this.b1 = C9507sV.l(this.X.getTimeInMillis());
        }
        return this.b1;
    }

    public long t() {
        return this.X.getTimeInMillis();
    }

    @InterfaceC5670cr1
    public C3548Lk1 u(int i) {
        Calendar f = C11143zD2.f(this.X);
        f.add(2, i);
        return new C3548Lk1(f);
    }

    public int v(@InterfaceC5670cr1 C3548Lk1 c3548Lk1) {
        if (this.X instanceof GregorianCalendar) {
            return ((c3548Lk1.Z - this.Z) * 12) + (c3548Lk1.Y - this.Y);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y);
    }
}

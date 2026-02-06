package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;
import o.C11143zD2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class d implements a.c {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final long X;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public d createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return new d(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public /* synthetic */ d(long j, a aVar) {
        this(j);
    }

    @InterfaceC5670cr1
    public static d a(long j) {
        return new d(j);
    }

    @InterfaceC5670cr1
    public static d b() {
        return a(C11143zD2.v().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean M(long j) {
        if (j <= this.X) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.X == ((d) obj).X) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.X)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeLong(this.X);
    }

    public d(long j) {
        this.X = j;
    }
}

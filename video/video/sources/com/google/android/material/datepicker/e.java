package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;
import o.C11143zD2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final long X;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public e createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return new e(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    public /* synthetic */ e(long j, a aVar) {
        this(j);
    }

    @InterfaceC5670cr1
    public static e a(long j) {
        return new e(j);
    }

    @InterfaceC5670cr1
    public static e b() {
        return a(C11143zD2.v().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean M(long j) {
        if (j >= this.X) {
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
        if ((obj instanceof e) && this.X == ((e) obj).X) {
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

    public e(long j) {
        this.X = j;
    }
}

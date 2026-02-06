package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o.InterfaceC11300zs1;
import o.OB;

/* loaded from: classes2.dex */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzp();
    public final zzr[] X;
    public int Y;
    public final int Y0;
    @InterfaceC11300zs1
    public final String Z;

    public zzs(Parcel parcel) {
        this.Z = parcel.readString();
        zzr[] zzrVarArr = (zzr[]) parcel.createTypedArray(zzr.CREATOR);
        String str = zzeu.a;
        this.X = zzrVarArr;
        this.Y0 = zzrVarArr.length;
    }

    public final zzr a(int i) {
        return this.X[i];
    }

    @OB
    public final zzs b(@InterfaceC11300zs1 String str) {
        if (Objects.equals(this.Z, str)) {
            return this;
        }
        return new zzs(str, false, this.X);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzr zzrVar, zzr zzrVar2) {
        zzr zzrVar3 = zzrVar2;
        UUID uuid = zzh.a;
        UUID uuid2 = zzrVar.Y;
        if (uuid.equals(uuid2)) {
            if (!uuid.equals(zzrVar3.Y)) {
                return 1;
            }
            return 0;
        }
        return uuid2.compareTo(zzrVar3.Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (Objects.equals(this.Z, zzsVar.Z) && Arrays.equals(this.X, zzsVar.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.Y;
        if (i == 0) {
            String str = this.Z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.X);
            this.Y = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Z);
        parcel.writeTypedArray(this.X, 0);
    }

    public zzs(@InterfaceC11300zs1 String str, boolean z, zzr... zzrVarArr) {
        this.Z = str;
        zzrVarArr = z ? (zzr[]) zzrVarArr.clone() : zzrVarArr;
        this.X = zzrVarArr;
        this.Y0 = zzrVarArr.length;
        Arrays.sort(zzrVarArr, this);
    }

    public zzs(@InterfaceC11300zs1 String str, zzr... zzrVarArr) {
        this(null, true, zzrVarArr);
    }

    public zzs(List list) {
        this(null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}

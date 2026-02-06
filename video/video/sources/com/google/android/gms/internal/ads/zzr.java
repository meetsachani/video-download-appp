package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzr implements Parcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzq();
    public int X;
    public final UUID Y;
    public final String Y0;
    @InterfaceC11300zs1
    public final String Z;
    @InterfaceC11300zs1
    public final byte[] Z0;

    public zzr(Parcel parcel) {
        this.Y = new UUID(parcel.readLong(), parcel.readLong());
        this.Z = parcel.readString();
        String readString = parcel.readString();
        String str = zzeu.a;
        this.Y0 = readString;
        this.Z0 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzr zzrVar = (zzr) obj;
        if (!Objects.equals(this.Z, zzrVar.Z) || !Objects.equals(this.Y0, zzrVar.Y0) || !Objects.equals(this.Y, zzrVar.Y) || !Arrays.equals(this.Z0, zzrVar.Z0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.X;
        if (i == 0) {
            int hashCode2 = this.Y.hashCode() * 31;
            String str = this.Z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode2 + hashCode) * 31) + this.Y0.hashCode()) * 31) + Arrays.hashCode(this.Z0);
            this.X = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.Y;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeByteArray(this.Z0);
    }

    public zzr(UUID uuid, @InterfaceC11300zs1 String str, String str2, @InterfaceC11300zs1 byte[] bArr) {
        uuid.getClass();
        this.Y = uuid;
        this.Z = null;
        this.Y0 = zzay.e(str2);
        this.Z0 = bArr;
    }
}

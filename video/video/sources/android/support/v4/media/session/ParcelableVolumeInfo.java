package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int X;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = i4;
        this.Z0 = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeInt(this.Y);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.X = parcel.readInt();
        this.Z = parcel.readInt();
        this.Y0 = parcel.readInt();
        this.Z0 = parcel.readInt();
        this.Y = parcel.readInt();
    }
}

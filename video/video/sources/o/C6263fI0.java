package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C4224Si1;

@Deprecated
/* renamed from: o.fI0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6263fI0 implements C4224Si1.b {
    public static final Parcelable.Creator<C6263fI0> CREATOR = new a();
    @InterfaceC11300zs1
    public final String X;
    @InterfaceC11300zs1
    public final String Y;
    public final List<b> Z;

    /* renamed from: o.fI0$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C6263fI0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6263fI0 createFromParcel(Parcel parcel) {
            return new C6263fI0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6263fI0[] newArray(int i) {
            return new C6263fI0[i];
        }
    }

    public C6263fI0(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, List<b> list) {
        this.X = str;
        this.Y = str2;
        this.Z = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6263fI0.class == obj.getClass()) {
            C6263fI0 c6263fI0 = (C6263fI0) obj;
            if (TextUtils.equals(this.X, c6263fI0.X) && TextUtils.equals(this.Y, c6263fI0.Y) && this.Z.equals(c6263fI0.Z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.X;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.Y;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.Z.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.X != null) {
            str = " [" + this.X + C6566gU0.h + this.Y + C6566gU0.g;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        int size = this.Z.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.Z.get(i2), 0);
        }
    }

    public C6263fI0(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.Z = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: o.fI0$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int X;
        public final int Y;
        @InterfaceC11300zs1
        public final String Y0;
        @InterfaceC11300zs1
        public final String Z;
        @InterfaceC11300zs1
        public final String Z0;
        @InterfaceC11300zs1
        public final String a1;

        /* renamed from: o.fI0$b$a */
        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i, int i2, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4) {
            this.X = i;
            this.Y = i2;
            this.Z = str;
            this.Y0 = str2;
            this.Z0 = str3;
            this.a1 = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.X == bVar.X && this.Y == bVar.Y && TextUtils.equals(this.Z, bVar.Z) && TextUtils.equals(this.Y0, bVar.Y0) && TextUtils.equals(this.Z0, bVar.Z0) && TextUtils.equals(this.a1, bVar.a1)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.X * 31) + this.Y) * 31;
            String str = this.Z;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.Y0;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.Z0;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.a1;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
            parcel.writeInt(this.Y);
            parcel.writeString(this.Z);
            parcel.writeString(this.Y0);
            parcel.writeString(this.Z0);
            parcel.writeString(this.a1);
        }

        public b(Parcel parcel) {
            this.X = parcel.readInt();
            this.Y = parcel.readInt();
            this.Z = parcel.readString();
            this.Y0 = parcel.readString();
            this.Z0 = parcel.readString();
            this.a1 = parcel.readString();
        }
    }
}

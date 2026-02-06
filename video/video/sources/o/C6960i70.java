package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@Deprecated
/* renamed from: o.i70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6960i70 implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C6960i70> CREATOR = new a();
    public final b[] X;
    public int Y;
    public final int Y0;
    @InterfaceC11300zs1
    public final String Z;

    /* renamed from: o.i70$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C6960i70> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6960i70 createFromParcel(Parcel parcel) {
            return new C6960i70(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6960i70[] newArray(int i) {
            return new C6960i70[i];
        }
    }

    /* renamed from: o.i70$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int X;
        public final UUID Y;
        public final String Y0;
        @InterfaceC11300zs1
        public final String Z;
        @InterfaceC11300zs1
        public final byte[] Z0;

        /* renamed from: o.i70$b$a */
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

        public b(UUID uuid, String str, @InterfaceC11300zs1 byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            if (c() && !bVar.c() && d(bVar.Y)) {
                return true;
            }
            return false;
        }

        @OB
        public b b(@InterfaceC11300zs1 byte[] bArr) {
            return new b(this.Y, this.Z, this.Y0, bArr);
        }

        public boolean c() {
            if (this.Z0 != null) {
                return true;
            }
            return false;
        }

        public boolean d(UUID uuid) {
            if (!C10323vs.d2.equals(this.Y) && !uuid.equals(this.Y)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!TD2.g(this.Z, bVar.Z) || !TD2.g(this.Y0, bVar.Y0) || !TD2.g(this.Y, bVar.Y) || !Arrays.equals(this.Z0, bVar.Z0)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.X == 0) {
                int hashCode2 = this.Y.hashCode() * 31;
                String str = this.Z;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.X = ((((hashCode2 + hashCode) * 31) + this.Y0.hashCode()) * 31) + Arrays.hashCode(this.Z0);
            }
            return this.X;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.Y.getMostSignificantBits());
            parcel.writeLong(this.Y.getLeastSignificantBits());
            parcel.writeString(this.Z);
            parcel.writeString(this.Y0);
            parcel.writeByteArray(this.Z0);
        }

        public b(UUID uuid, @InterfaceC11300zs1 String str, String str2, @InterfaceC11300zs1 byte[] bArr) {
            this.Y = (UUID) C9542sf.g(uuid);
            this.Z = str;
            this.Y0 = (String) C9542sf.g(str2);
            this.Z0 = bArr;
        }

        public b(Parcel parcel) {
            this.Y = new UUID(parcel.readLong(), parcel.readLong());
            this.Z = parcel.readString();
            this.Y0 = (String) TD2.o(parcel.readString());
            this.Z0 = parcel.createByteArray();
        }
    }

    public C6960i70(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static boolean b(ArrayList<b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).Y.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC11300zs1
    public static C6960i70 d(@InterfaceC11300zs1 C6960i70 c6960i70, @InterfaceC11300zs1 C6960i70 c6960i702) {
        String str;
        b[] bVarArr;
        b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (c6960i70 != null) {
            str = c6960i70.Z;
            for (b bVar : c6960i70.X) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c6960i702 != null) {
            if (str == null) {
                str = c6960i702.Z;
            }
            int size = arrayList.size();
            for (b bVar2 : c6960i702.X) {
                if (bVar2.c() && !b(arrayList, size, bVar2.Y)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6960i70(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C10323vs.d2;
        if (uuid.equals(bVar.Y)) {
            if (uuid.equals(bVar2.Y)) {
                return 0;
            }
            return 1;
        }
        return bVar.Y.compareTo(bVar2.Y);
    }

    @OB
    public C6960i70 c(@InterfaceC11300zs1 String str) {
        if (TD2.g(this.Z, str)) {
            return this;
        }
        return new C6960i70(str, false, this.X);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i) {
        return this.X[i];
    }

    @Override // java.util.Comparator
    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6960i70.class == obj.getClass()) {
            C6960i70 c6960i70 = (C6960i70) obj;
            if (TD2.g(this.Z, c6960i70.Z) && Arrays.equals(this.X, c6960i70.X)) {
                return true;
            }
        }
        return false;
    }

    public C6960i70 f(C6960i70 c6960i70) {
        boolean z;
        String str;
        String str2 = this.Z;
        if (str2 != null && (str = c6960i70.Z) != null && !TextUtils.equals(str2, str)) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.i(z);
        String str3 = this.Z;
        if (str3 == null) {
            str3 = c6960i70.Z;
        }
        return new C6960i70(str3, (b[]) TD2.o1(this.X, c6960i70.X));
    }

    public int hashCode() {
        int hashCode;
        if (this.Y == 0) {
            String str = this.Z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.Y = (hashCode * 31) + Arrays.hashCode(this.X);
        }
        return this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Z);
        parcel.writeTypedArray(this.X, 0);
    }

    public C6960i70(@InterfaceC11300zs1 String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C6960i70(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C6960i70(@InterfaceC11300zs1 String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C6960i70(@InterfaceC11300zs1 String str, boolean z, b... bVarArr) {
        this.Z = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.X = bVarArr;
        this.Y0 = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C6960i70(Parcel parcel) {
        this.Z = parcel.readString();
        b[] bVarArr = (b[]) TD2.o((b[]) parcel.createTypedArray(b.CREATOR));
        this.X = bVarArr;
        this.Y0 = bVarArr.length;
    }
}

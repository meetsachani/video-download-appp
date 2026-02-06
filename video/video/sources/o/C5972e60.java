package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C8322nf1;

@Deprecated
/* renamed from: o.e60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5972e60 implements Parcelable {
    public static final Parcelable.Creator<C5972e60> CREATOR = new a();
    public final String X;
    public final Uri Y;
    public final List<C3031Gd2> Y0;
    @InterfaceC11300zs1
    public final String Z;
    @InterfaceC11300zs1
    public final byte[] Z0;
    @InterfaceC11300zs1
    public final String a1;
    public final byte[] b1;

    /* renamed from: o.e60$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C5972e60> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5972e60 createFromParcel(Parcel parcel) {
            return new C5972e60(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C5972e60[] newArray(int i) {
            return new C5972e60[i];
        }
    }

    /* renamed from: o.e60$b */
    /* loaded from: classes2.dex */
    public static class b {
        public final String a;
        public final Uri b;
        @InterfaceC11300zs1
        public String c;
        @InterfaceC11300zs1
        public List<C3031Gd2> d;
        @InterfaceC11300zs1
        public byte[] e;
        @InterfaceC11300zs1
        public String f;
        @InterfaceC11300zs1
        public byte[] g;

        public b(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public C5972e60 a() {
            String str = this.a;
            Uri uri = this.b;
            String str2 = this.c;
            List list = this.d;
            if (list == null) {
                list = AbstractC5317bO0.L();
            }
            return new C5972e60(str, uri, str2, list, this.e, this.f, this.g, null);
        }

        @InterfaceC6181ey
        public b b(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @InterfaceC6181ey
        public b c(@InterfaceC11300zs1 byte[] bArr) {
            this.g = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b d(@InterfaceC11300zs1 byte[] bArr) {
            this.e = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b e(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @InterfaceC6181ey
        public b f(@InterfaceC11300zs1 List<C3031Gd2> list) {
            this.d = list;
            return this;
        }
    }

    /* renamed from: o.e60$c */
    /* loaded from: classes2.dex */
    public static class c extends IOException {
    }

    public /* synthetic */ C5972e60(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public C5972e60 a(String str) {
        return new C5972e60(str, this.Y, this.Z, this.Y0, this.Z0, this.a1, this.b1);
    }

    public C5972e60 b(@InterfaceC11300zs1 byte[] bArr) {
        return new C5972e60(this.X, this.Y, this.Z, this.Y0, bArr, this.a1, this.b1);
    }

    public C5972e60 c(C5972e60 c5972e60) {
        List list;
        C9542sf.a(this.X.equals(c5972e60.X));
        if (!this.Y0.isEmpty() && !c5972e60.Y0.isEmpty()) {
            list = new ArrayList(this.Y0);
            for (int i = 0; i < c5972e60.Y0.size(); i++) {
                C3031Gd2 c3031Gd2 = c5972e60.Y0.get(i);
                if (!list.contains(c3031Gd2)) {
                    list.add(c3031Gd2);
                }
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        return new C5972e60(this.X, c5972e60.Y, c5972e60.Z, list, c5972e60.Z0, c5972e60.a1, c5972e60.b1);
    }

    public C8322nf1 d() {
        return new C8322nf1.c().D(this.X).L(this.Y).l(this.a1).F(this.Z).H(this.Y0).a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof C5972e60)) {
            return false;
        }
        C5972e60 c5972e60 = (C5972e60) obj;
        if (!this.X.equals(c5972e60.X) || !this.Y.equals(c5972e60.Y) || !TD2.g(this.Z, c5972e60.Z) || !this.Y0.equals(c5972e60.Y0) || !Arrays.equals(this.Z0, c5972e60.Z0) || !TD2.g(this.a1, c5972e60.a1) || !Arrays.equals(this.b1, c5972e60.b1)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.X.hashCode() * 961) + this.Y.hashCode()) * 31;
        String str = this.Z;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.Y0.hashCode()) * 31) + Arrays.hashCode(this.Z0)) * 31;
        String str2 = this.a1;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Arrays.hashCode(this.b1);
    }

    public String toString() {
        return this.Z + ":" + this.X;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y.toString());
        parcel.writeString(this.Z);
        parcel.writeInt(this.Y0.size());
        for (int i2 = 0; i2 < this.Y0.size(); i2++) {
            parcel.writeParcelable(this.Y0.get(i2), 0);
        }
        parcel.writeByteArray(this.Z0);
        parcel.writeString(this.a1);
        parcel.writeByteArray(this.b1);
    }

    public C5972e60(String str, Uri uri, @InterfaceC11300zs1 String str2, List<C3031Gd2> list, @InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 byte[] bArr2) {
        int P0 = TD2.P0(uri, str2);
        if (P0 == 0 || P0 == 2 || P0 == 1) {
            boolean z = str3 == null;
            C9542sf.b(z, "customCacheKey must be null for type: " + P0);
        }
        this.X = str;
        this.Y = uri;
        this.Z = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.Y0 = Collections.unmodifiableList(arrayList);
        this.Z0 = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.a1 = str3;
        this.b1 = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : TD2.f;
    }

    public C5972e60(Parcel parcel) {
        this.X = (String) TD2.o(parcel.readString());
        this.Y = Uri.parse((String) TD2.o(parcel.readString()));
        this.Z = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C3031Gd2) parcel.readParcelable(C3031Gd2.class.getClassLoader()));
        }
        this.Y0 = Collections.unmodifiableList(arrayList);
        this.Z0 = parcel.createByteArray();
        this.a1 = parcel.readString();
        this.b1 = (byte[]) TD2.o(parcel.createByteArray());
    }
}

package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import o.C11005yf1;
import o.C4224Si1;

@Deprecated
/* loaded from: classes2.dex */
public final class HL0 implements C4224Si1.b {
    public static final Parcelable.Creator<HL0> CREATOR = new a();
    public static final String b1 = "Icy-MetaData";
    public static final String c1 = "1";
    public static final String d1 = "IcyHeaders";
    public static final String e1 = "icy-br";
    public static final String f1 = "icy-genre";
    public static final String g1 = "icy-name";
    public static final String h1 = "icy-url";
    public static final String i1 = "icy-pub";
    public static final String j1 = "icy-metaint";
    public final int X;
    @InterfaceC11300zs1
    public final String Y;
    @InterfaceC11300zs1
    public final String Y0;
    @InterfaceC11300zs1
    public final String Z;
    public final boolean Z0;
    public final int a1;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HL0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HL0 createFromParcel(Parcel parcel) {
            return new HL0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HL0[] newArray(int i) {
            return new HL0[i];
        }
    }

    public HL0(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, boolean z, int i2) {
        C9542sf.a(i2 == -1 || i2 > 0);
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = z;
        this.a1 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HL0 a(Map<String, List<String>> map) {
        boolean z;
        int i;
        List<String> list;
        HL0 hl0;
        List<String> list2;
        String str;
        List<String> list3;
        String str2;
        List<String> list4;
        boolean z2;
        List<String> list5;
        int i2;
        List<String> list6 = map.get(e1);
        boolean z3 = true;
        int i3 = -1;
        if (list6 != null) {
            String str3 = list6.get(0);
            try {
                i2 = Integer.parseInt(str3) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        I31.n(d1, "Invalid bitrate: " + str3);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        I31.n(d1, "Invalid bitrate header: " + str3);
                        z = false;
                        i = i2;
                        list = map.get(f1);
                        String str4 = null;
                        if (list == null) {
                        }
                        list2 = map.get(g1);
                        if (list2 == null) {
                        }
                        list3 = map.get(h1);
                        if (list3 == null) {
                        }
                        list4 = map.get(i1);
                        if (list4 == null) {
                        }
                        list5 = map.get(j1);
                        if (list5 != null) {
                        }
                        int i4 = i3;
                        if (z) {
                        }
                        return hl0;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        list = map.get(f1);
        String str42 = null;
        if (list == null) {
            hl0 = null;
            str42 = list.get(0);
            z = true;
        } else {
            hl0 = null;
        }
        list2 = map.get(g1);
        if (list2 == null) {
            str = list2.get(0);
            z = true;
        } else {
            str = hl0;
        }
        list3 = map.get(h1);
        if (list3 == null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = hl0;
        }
        list4 = map.get(i1);
        if (list4 == null) {
            z2 = list4.get(0).equals("1");
            z = true;
        } else {
            z2 = false;
        }
        list5 = map.get(j1);
        if (list5 != null) {
            String str5 = list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i3 = parseInt;
                } else {
                    try {
                        I31.n(d1, "Invalid metadata interval: " + str5);
                        z3 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = parseInt;
                        I31.n(d1, "Invalid metadata interval: " + str5);
                        int i42 = i3;
                        if (z) {
                        }
                        return hl0;
                    }
                }
                z = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i422 = i3;
        if (z) {
            hl0 = new HL0(i, str42, str, str2, z2, i422);
        }
        return hl0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HL0.class == obj.getClass()) {
            HL0 hl0 = (HL0) obj;
            if (this.X == hl0.X && TD2.g(this.Y, hl0.Y) && TD2.g(this.Z, hl0.Z) && TD2.g(this.Y0, hl0.Y0) && this.Z0 == hl0.Z0 && this.a1 == hl0.a1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.X) * 31;
        String str = this.Y;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.Z;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.Y0;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.Z0 ? 1 : 0)) * 31) + this.a1;
    }

    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        String str = this.Z;
        if (str != null) {
            bVar.l0(str);
        }
        String str2 = this.Y;
        if (str2 != null) {
            bVar.a0(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.Z + "\", genre=\"" + this.Y + "\", bitrate=" + this.X + ", metadataInterval=" + this.a1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        TD2.c2(parcel, this.Z0);
        parcel.writeInt(this.a1);
    }

    public HL0(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = TD2.w1(parcel);
        this.a1 = parcel.readInt();
    }
}

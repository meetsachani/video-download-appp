package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import o.C11005yf1;

@Deprecated
/* renamed from: o.Bm2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2566Bm2 extends LL0 {
    public static final Parcelable.Creator<C2566Bm2> CREATOR = new a();
    @InterfaceC11300zs1
    public final String Y;
    public final AbstractC5317bO0<String> Y0;
    @Deprecated
    public final String Z;

    /* renamed from: o.Bm2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C2566Bm2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2566Bm2 createFromParcel(Parcel parcel) {
            return new C2566Bm2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C2566Bm2[] newArray(int i) {
            return new C2566Bm2[i];
        }
    }

    public /* synthetic */ C2566Bm2(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            } else {
                if (str.length() >= 4) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                }
                return arrayList;
            }
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2566Bm2.class == obj.getClass()) {
            C2566Bm2 c2566Bm2 = (C2566Bm2) obj;
            if (TD2.g(this.X, c2566Bm2.X) && TD2.g(this.Y, c2566Bm2.Y) && this.Y0.equals(c2566Bm2.Y0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.X.hashCode()) * 31;
        String str = this.Y;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.Y0.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        Integer num;
        String str = this.X;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    bVar.N(this.Y0.get(0));
                    return;
                case 1:
                case 11:
                    bVar.T(this.Y0.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = this.Y0.get(0);
                    bVar.g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.O(this.Y0.get(0));
                    return;
                case 4:
                case 18:
                    bVar.M(this.Y0.get(0));
                    return;
                case 5:
                case 19:
                    bVar.U(this.Y0.get(0));
                    return;
                case 6:
                case 20:
                    String[] J1 = TD2.J1(this.Y0.get(0), RemoteSettings.i);
                    int parseInt = Integer.parseInt(J1[0]);
                    if (J1.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(J1[1]));
                    } else {
                        num = null;
                    }
                    bVar.q0(Integer.valueOf(parseInt)).p0(num);
                    return;
                case 7:
                case 16:
                    bVar.n0(this.Y0.get(0));
                    return;
                case '\b':
                case 15:
                    bVar.s0(this.Y0.get(0));
                    return;
                case '\t':
                case 21:
                    bVar.h0(Integer.valueOf(Integer.parseInt(this.Y0.get(0))));
                    return;
                case '\r':
                    List<Integer> a2 = a(this.Y0.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.f0(a2.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.g0(a2.get(1));
                    }
                    bVar.h0(a2.get(0));
                    return;
                case 14:
                    List<Integer> a3 = a(this.Y0.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.i0(a3.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.j0(a3.get(1));
                    }
                    bVar.k0(a3.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": description=" + this.Y + ": values=" + this.Y0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeStringArray((String[]) this.Y0.toArray(new String[0]));
    }

    public C2566Bm2(String str, @InterfaceC11300zs1 String str2, List<String> list) {
        super(str);
        C9542sf.a(!list.isEmpty());
        this.Y = str2;
        AbstractC5317bO0<String> F = AbstractC5317bO0.F(list);
        this.Y0 = F;
        this.Z = F.get(0);
    }

    @Deprecated
    @VP0(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    public C2566Bm2(String str, @InterfaceC11300zs1 String str2, String str3) {
        this(str, str2, AbstractC5317bO0.M(str3));
    }

    public C2566Bm2(Parcel parcel) {
        this((String) C9542sf.g(parcel.readString()), parcel.readString(), AbstractC5317bO0.H((String[]) C9542sf.g(parcel.createStringArray())));
    }
}

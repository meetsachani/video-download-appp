package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.C8206nB;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahc extends zzagx {
    @InterfaceC11300zs1
    public final String b;
    public final zzfyc c;

    public zzahc(String str, @InterfaceC11300zs1 String str2, List list) {
        super(str);
        zzdc.d(!list.isEmpty());
        this.b = str2;
        zzfyc B = zzfyc.B(list);
        this.c = B;
        String str3 = (String) B.get(0);
    }

    public static List b(String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzau
    public final void a(zzar zzarVar) {
        char c;
        Integer num;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case 1:
                    zzarVar.O((CharSequence) this.c.get(0));
                    return;
                case 2:
                case 3:
                    zzarVar.B((CharSequence) this.c.get(0));
                    return;
                case 4:
                case 5:
                    zzarVar.z((CharSequence) this.c.get(0));
                    return;
                case 6:
                case 7:
                    zzarVar.A((CharSequence) this.c.get(0));
                    return;
                case '\b':
                case '\t':
                    String str2 = zzeu.a;
                    String[] split = ((String) this.c.get(0)).split(RemoteSettings.i, -1);
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    zzarVar.R(Integer.valueOf(parseInt));
                    zzarVar.Q(num);
                    return;
                case '\n':
                case 11:
                    zzarVar.J(Integer.valueOf(Integer.parseInt((String) this.c.get(0))));
                    return;
                case '\f':
                case '\r':
                    String str3 = (String) this.c.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    zzarVar.I(Integer.valueOf(parseInt2));
                    zzarVar.H(Integer.valueOf(parseInt3));
                    return;
                case 14:
                    List b = b((String) this.c.get(0));
                    int size = b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzarVar.H((Integer) b.get(2));
                            } else {
                                return;
                            }
                        }
                        zzarVar.I((Integer) b.get(1));
                    }
                    zzarVar.J((Integer) b.get(0));
                    return;
                case 15:
                    List b2 = b((String) this.c.get(0));
                    int size2 = b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzarVar.K((Integer) b2.get(2));
                            } else {
                                return;
                            }
                        }
                        zzarVar.L((Integer) b2.get(1));
                    }
                    zzarVar.M((Integer) b2.get(0));
                    return;
                case 16:
                case 17:
                    zzarVar.C((CharSequence) this.c.get(0));
                    return;
                case 18:
                case 19:
                    zzarVar.D((CharSequence) this.c.get(0));
                    return;
                case 20:
                case 21:
                    zzarVar.S((CharSequence) this.c.get(0));
                    return;
                case 22:
                    zzfyc zzfycVar = this.c;
                    Integer g = zzgbf.g((String) zzfycVar.get(0), 10);
                    if (g == null) {
                        zzarVar.G((CharSequence) zzfycVar.get(0));
                        return;
                    }
                    String a = zzagy.a(g.intValue());
                    if (a != null) {
                        zzarVar.G(a);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahc.class == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (Objects.equals(this.a, zzahcVar.a) && Objects.equals(this.b, zzahcVar.b) && this.c.equals(zzahcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() + 527;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((hashCode * 31) + i) * 31) + this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return this.a + ": description=" + this.b + ": values=" + valueOf;
    }
}

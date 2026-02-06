package o;

import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import o.AbstractC5317bO0;

@Deprecated
/* renamed from: o.iW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7059iW1 {
    public final long a;
    public final int b;
    public final Uri c;

    public C7059iW1(long j, int i, Uri uri) {
        this.a = j;
        this.b = i;
        this.c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:7:0x002e, B:30:0x007b, B:32:0x0082, B:33:0x0087, B:34:0x0088, B:35:0x008d, B:14:0x0052, B:19:0x005e, B:22:0x0069), top: B:54:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5317bO0<C7059iW1> a(String str, Uri uri) throws C3989Py1 {
        char c;
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        String[] J1 = TD2.J1(str, ",");
        int length = J1.length;
        int i = 0;
        while (i < length) {
            String str2 = J1[i];
            String[] J12 = TD2.J1(str2, ";");
            int length2 = J12.length;
            int i2 = i;
            long j = C10323vs.b;
            int i3 = 0;
            Uri uri2 = null;
            int i4 = -1;
            while (i3 < length2) {
                String str3 = J12[i3];
                try {
                    String[] K1 = TD2.K1(str3, "=");
                    String str4 = K1[0];
                    String str5 = K1[1];
                    int hashCode = str4.hashCode();
                    String[] strArr = J1;
                    int i5 = length;
                    if (hashCode != 113759) {
                        if (hashCode != 116079) {
                            if (hashCode == 1524180539 && str4.equals("rtptime")) {
                                c = 2;
                                if (c == 0) {
                                    if (c != 1) {
                                        if (c == 2) {
                                            j = Long.parseLong(str5);
                                        } else {
                                            throw C3989Py1.c(str4, null);
                                        }
                                    } else {
                                        i4 = Integer.parseInt(str5);
                                    }
                                } else {
                                    uri2 = b(str5, uri);
                                }
                                i3++;
                                J1 = strArr;
                                length = i5;
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                            i3++;
                            J1 = strArr;
                            length = i5;
                        } else {
                            if (str4.equals("url")) {
                                c = 0;
                                if (c == 0) {
                                }
                                i3++;
                                J1 = strArr;
                                length = i5;
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                            i3++;
                            J1 = strArr;
                            length = i5;
                        }
                    } else {
                        if (str4.equals("seq")) {
                            c = 1;
                            if (c == 0) {
                            }
                            i3++;
                            J1 = strArr;
                            length = i5;
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        i3++;
                        J1 = strArr;
                        length = i5;
                    }
                } catch (Exception e) {
                    throw C3989Py1.c(str3, e);
                }
                throw C3989Py1.c(str3, e);
            }
            String[] strArr2 = J1;
            int i6 = length;
            if (uri2 != null && uri2.getScheme() != null && (i4 != -1 || j != C10323vs.b)) {
                aVar.g(new C7059iW1(j, i4, uri2));
                i = i2 + 1;
                J1 = strArr2;
                length = i6;
            } else {
                throw C3989Py1.c(str2, null);
            }
        }
        return aVar.e();
    }

    @InterfaceC5056aJ2
    public static Uri b(String str, Uri uri) {
        C9542sf.a(((String) C9542sf.g(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) C9542sf.g(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith(RemoteSettings.i)) {
            return RC2.f(uri2, str);
        }
        return RC2.f(uri2 + RemoteSettings.i, str);
    }
}

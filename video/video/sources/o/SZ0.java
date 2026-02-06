package o;

import java.io.IOException;

@InterfaceC7797la0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class SZ0 {
    public StringBuilder a = new StringBuilder();
    public boolean b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        if (this.b && i2 > 0) {
            if (cArr[i] == '\n') {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c(z2)) {
                i3 = i + 1;
                i4 = i + i2;
                int i5 = i3;
                while (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\n') {
                        if (c == '\r') {
                            this.a.append(cArr, i5, i3 - i5);
                            this.b = true;
                            int i6 = i3 + 1;
                            if (i6 < i4) {
                                if (cArr[i6] == '\n') {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (c(z)) {
                                    i3 = i6;
                                }
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        this.a.append(cArr, i5, i3 - i5);
                        c(true);
                    }
                    i5 = i3 + 1;
                    i3++;
                }
                this.a.append(cArr, i5, i4 - i5);
            }
        }
        i3 = i;
        i4 = i + i2;
        int i52 = i3;
        while (i3 < i4) {
        }
        this.a.append(cArr, i52, i4 - i52);
    }

    public void b() throws IOException {
        if (!this.b && this.a.length() <= 0) {
            return;
        }
        c(false);
    }

    @InterfaceC6181ey
    public final boolean c(boolean z) throws IOException {
        String str;
        if (this.b) {
            if (z) {
                str = VI0.D;
            } else {
                str = "\r";
            }
        } else if (z) {
            str = "\n";
        } else {
            str = "";
        }
        d(this.a.toString(), str);
        this.a = new StringBuilder();
        this.b = false;
        return z;
    }

    public abstract void d(String str, String str2) throws IOException;
}

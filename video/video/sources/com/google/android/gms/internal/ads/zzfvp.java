package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfvp extends zzfuh {
    public final CharSequence Z;
    public int Y0 = 0;
    public int Z0 = Integer.MAX_VALUE;

    public zzfvp(zzfvr zzfvrVar, CharSequence charSequence) {
        this.Z = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final /* bridge */ /* synthetic */ Object b() {
        int d;
        int i = this.Y0;
        while (true) {
            int i2 = this.Y0;
            if (i2 != -1) {
                int e = e(i2);
                if (e == -1) {
                    e = this.Z.length();
                    this.Y0 = -1;
                    d = -1;
                } else {
                    d = d(e);
                    this.Y0 = d;
                }
                if (d == i) {
                    int i3 = d + 1;
                    this.Y0 = i3;
                    if (i3 > this.Z.length()) {
                        this.Y0 = -1;
                    }
                } else {
                    if (i < e) {
                        this.Z.charAt(i);
                    }
                    if (i < e) {
                        this.Z.charAt(e - 1);
                    }
                    int i4 = this.Z0;
                    if (i4 == 1) {
                        CharSequence charSequence = this.Z;
                        int length = charSequence.length();
                        this.Y0 = -1;
                        if (length > i) {
                            charSequence.charAt(length - 1);
                        }
                        e = length;
                    } else {
                        this.Z0 = i4 - 1;
                    }
                    return this.Z.subSequence(i, e).toString();
                }
            } else {
                c();
                return null;
            }
        }
    }

    public abstract int d(int i);

    public abstract int e(int i);
}

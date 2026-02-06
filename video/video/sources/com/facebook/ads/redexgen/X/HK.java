package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C3307Iz;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class HK {
    public static byte[] A02;
    public static final Pattern A03;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{64, 62, 69, C3307Iz.f0, 51, C3307Iz.Z, Byte.MAX_VALUE, 51, QC1.w, 95, 51, 88, 67, 101, C3307Iz.Y, 99, 62, 54, 69, C3307Iz.f0, 51, C3307Iz.Z, Byte.MAX_VALUE, 51, QC1.w, 95, 51, 88, 67, 101, C3307Iz.Y, 99, 55, 62, 54, 69, C3307Iz.f0, 51, C3307Iz.Z, Byte.MAX_VALUE, 51, QC1.w, 95, 51, 88, 67, 101, C3307Iz.Y, 99, 55, 40, 36, C3307Iz.Y, 101, 42, 59, 59, C3307Iz.Z, C3307Iz.f0, 101, 34, 31, 62, C3307Iz.X, C3307Iz.f0, 56, 86, 107, 74, 81, 108, 114, 111, 125};
    }

    static {
        A01();
        A03 = Pattern.compile(A00(0, 50, 25));
    }

    private boolean A02(String str) {
        Matcher matcher = A03.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) C5C.A0f(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) C5C.A0f(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A05(Metadata metadata) {
        for (int i = 0; i < i; i++) {
            Metadata.Entry A032 = metadata.A03(i);
            boolean z = A032 instanceof CommentFrame;
            String A00 = A00(66, 8, 56);
            if (z) {
                CommentFrame commentFrame = (CommentFrame) A032;
                if (A00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else if (A032 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) A032;
                if (A00(50, 16, 76).equals(internalFrame.A01) && A00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}

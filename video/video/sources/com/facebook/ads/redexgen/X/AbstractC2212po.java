package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import o.C8077mf;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.po  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2212po {
    public static byte[] A00;
    public static String[] A01 = {"TjwGK8026J8LuqpHpLFvP2qkj", "KunvWIfGJHX7HbktOkm4MkD4kcFcu9wT", "QjUrIUPqRg1gsQtfLrmUPiSj1", "hJhvRorUNw8eJjUCTMSK9XaE24mC2alD", "Tu6zUEMe1bl4a7998mqTIFcXwEKbBm8m", "M1p7igLEPvcmLPbfEPVmBOai", "JVDSc2uxo9h85gcqbpEojEewGNrzMl9R", "xry660e9EuWNkwUeRbJOaxl6l4kfk7Fh"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @CheckForNull
    public static <V> V A05(@CheckForNull Map<?, V> map, Object key) {
        AbstractC1912ki.A04(map);
        try {
            return map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @CheckForNull
    public static <V> V A06(@CheckForNull Map<?, V> map, Object key) {
        AbstractC1912ki.A04(map);
        try {
            return map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{76, 64, 0, C8077mf.G, C8077mf.y, 0, 6, 17, 0, 1, 54, C8077mf.n, 31, 0};
        if (A01[5].length() == 3) {
            throw new RuntimeException();
        }
        A01[5] = "l4YJgmx6qI";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0C(@CheckForNull Map<?, ?> map, Object key) {
        AbstractC1912ki.A04(map);
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static {
        A09();
    }

    public static int A00(int expectedSize) {
        if (expectedSize < 3) {
            AbstractC2059nJ.A00(expectedSize, A07(2, 12, 124));
            int i = expectedSize + 1;
            if (A01[6].charAt(13) != 's') {
                String[] strArr = A01;
                strArr[2] = "v9VFtcyEVV9ymySR9OVMr7RkF";
                strArr[0] = "Yfss3f07HcaF8zCrtbecDwNdH";
                return i;
            }
            throw new RuntimeException();
        } else if (expectedSize < 1073741824) {
            return (int) Math.ceil(expectedSize / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static <K, V> Map.Entry<K, V> A01(@ParametricNullness K key, @ParametricNullness V value) {
        return new BQ(key, value);
    }

    public static <K, V> Iterator<K> A02(Iterator<Map.Entry<K, V>> entryIterator) {
        return new BL(entryIterator);
    }

    public static <K, V> Iterator<V> A03(Iterator<Map.Entry<K, V>> entryIterator) {
        return new BK(entryIterator);
    }

    public static <V> InterfaceC1893kO<Map.Entry<?, V>, V> A04() {
        BJ bj = BJ.A03;
        if (A01[6].charAt(13) != 's') {
            A01[6] = "R0MoS7T4JZROoHrLtuxkN6DM2XkxoreU";
            return bj;
        }
        throw new RuntimeException();
    }

    public static String A08(Map<?, ?> map) {
        StringBuilder append = AbstractC2078nc.A01(map.size()).append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                String[] strArr = A01;
                if (strArr[3].charAt(29) == strArr[7].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "LuqjCLBVeKEi1AZvZkL9PbjPH";
                strArr2[0] = "FpOiwMODSylVfNj2ewxL0FWcD";
                append.append(A07(0, 2, 121));
            }
            z = false;
            append.append(entry.getKey()).append('=').append(entry.getValue());
        }
        StringBuilder sb = append.append('}');
        return sb.toString();
    }

    public static boolean A0A(@CheckForNull Map<?, ?> map, Object value) {
        return AbstractC2172p9.A0D(A03(map.entrySet().iterator()), value);
    }

    public static boolean A0B(@CheckForNull Map<?, ?> map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            return map.entrySet().equals(((Map) object).entrySet());
        }
        String[] strArr = A01;
        if (strArr[4].charAt(2) != strArr[1].charAt(2)) {
            A01[5] = "0gxsrdth";
            return false;
        }
        throw new RuntimeException();
    }
}

package o;

import android.os.Build;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.t92  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9666t92 implements InterfaceC10688xL1 {
    public static final String a = "SmallDisplaySizeQuirk";
    public static final Map<String, Size> b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("REDMI NOTE 8", new Size(FC.u, 2340));
        hashMap.put("REDMI NOTE 7", new Size(FC.u, 2340));
        hashMap.put("SM-A207M", new Size(720, 1560));
        hashMap.put("REDMI NOTE 7S", new Size(FC.u, 2340));
        hashMap.put("SM-A127F", new Size(720, 1600));
        hashMap.put("SM-A536E", new Size(FC.u, 2400));
        hashMap.put("220233L2I", new Size(720, 1600));
        hashMap.put("V2149", new Size(720, 1600));
        hashMap.put("VIVO 1920", new Size(FC.u, 2340));
        hashMap.put("CPH2223", new Size(FC.u, 2400));
        hashMap.put("V2029", new Size(720, 1600));
        hashMap.put("CPH1901", new Size(720, EC.v));
        hashMap.put("REDMI Y3", new Size(720, EC.v));
        hashMap.put("SM-A045M", new Size(720, 1600));
        hashMap.put("SM-A146U", new Size(FC.u, 2408));
        hashMap.put("CPH1909", new Size(720, EC.v));
        hashMap.put("NOKIA 4.2", new Size(720, EC.v));
        hashMap.put("SM-G960U1", new Size(1440, 2960));
        hashMap.put("SM-A137F", new Size(FC.u, 2408));
        hashMap.put("VIVO 1816", new Size(720, EC.v));
        hashMap.put("INFINIX X6817", new Size(720, 1612));
        hashMap.put("SM-A037F", new Size(720, 1600));
        hashMap.put("NOKIA 2.4", new Size(720, 1600));
        hashMap.put("SM-A125M", new Size(720, 1600));
        hashMap.put("INFINIX X670", new Size(FC.u, 2400));
    }

    public static boolean e() {
        return b.containsKey(Build.MODEL.toUpperCase(Locale.US));
    }

    public Size d() {
        return b.get(Build.MODEL.toUpperCase(Locale.US));
    }
}

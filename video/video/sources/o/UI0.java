package o;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public interface UI0 {
    public static final char a = ',';
    public static final int b = 1024;
    public static final int c = 128;
    public static final char d = '\"';
    public static final char e = '\\';
    public static final boolean f = false;
    public static final boolean g = true;
    public static final boolean h = false;
    public static final char i = 0;
    public static final EnumC4456Us j = EnumC4456Us.NEITHER;
    public static final String k = "opencsv";
    public static final int l = 16;
    public static final String m = "\n";

    char a();

    String b();

    String[] c(String str) throws IOException;

    void d(Locale locale);

    String[] e(String str) throws IOException;

    String f(String[] strArr, boolean z);

    char g();

    boolean h();

    EnumC4456Us i();
}

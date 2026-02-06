package o;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.iC1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6981iC1 implements FilenameFilter {
    public final Pattern X;

    public C6981iC1(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.X.matcher(str).matches();
    }

    public C6981iC1(Pattern pattern) {
        this.X = (Pattern) C10664xF1.E(pattern);
    }
}

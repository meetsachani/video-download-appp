package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzgat implements FilenameFilter {
    public final Pattern X;

    public zzgat(Pattern pattern) {
        pattern.getClass();
        this.X = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.X.matcher(str).matches();
    }
}

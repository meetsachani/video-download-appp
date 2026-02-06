package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzji extends IOException {
    public zzkj X;

    public zzji(String str) {
        super(str);
        this.X = null;
    }

    public static zzjh a() {
        return new zzjh("Protocol message tag had invalid wire type.");
    }

    public static zzji b() {
        return new zzji("Protocol message end-group tag did not match expected tag.");
    }

    public static zzji c() {
        return new zzji("Protocol message contained an invalid tag (zero).");
    }

    public static zzji d() {
        return new zzji("Protocol message had invalid UTF-8.");
    }

    public static zzji e() {
        return new zzji("CodedInputStream encountered a malformed varint.");
    }

    public static zzji f() {
        return new zzji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzji g() {
        return new zzji("Failed to parse the message.");
    }

    public static zzji h() {
        return new zzji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

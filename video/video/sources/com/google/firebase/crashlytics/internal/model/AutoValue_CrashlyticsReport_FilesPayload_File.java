package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {
    public final String a;
    public final byte[] b;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {
        public String a;
        public byte[] b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder b(byte[] bArr) {
            if (bArr != null) {
                this.b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @InterfaceC5670cr1
    public byte[] b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @InterfaceC5670cr1
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        byte[] b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload.File) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            if (this.a.equals(file.c())) {
                byte[] bArr = this.b;
                if (file instanceof AutoValue_CrashlyticsReport_FilesPayload_File) {
                    b = ((AutoValue_CrashlyticsReport_FilesPayload_File) file).b;
                } else {
                    b = file.b();
                }
                if (Arrays.equals(bArr, b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}

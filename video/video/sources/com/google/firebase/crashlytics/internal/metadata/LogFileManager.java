package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class LogFileManager {
    public static final String c = "userlog";
    public static final NoopLogStore d = new NoopLogStore();
    public static final int e = 65536;
    public final FileStore a;
    public FileLogStore b;

    /* loaded from: classes3.dex */
    public static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void e(long j, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.a = fileStore;
        this.b = d;
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    @InterfaceC11300zs1
    public String c() {
        return this.b.b();
    }

    public final File d(String str) {
        return this.a.p(str, c);
    }

    public final void e(String str) {
        this.b.a();
        this.b = d;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i) {
        this.b = new QueueFileLogStore(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        e(str);
    }
}

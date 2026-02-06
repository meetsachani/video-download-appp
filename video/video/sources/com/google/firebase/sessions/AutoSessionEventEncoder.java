package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new AutoSessionEventEncoder();

    /* loaded from: classes3.dex */
    public static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {
        public static final AndroidApplicationInfoEncoder a = new AndroidApplicationInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("packageName");
        public static final FieldDescriptor c = FieldDescriptor.d("versionName");
        public static final FieldDescriptor d = FieldDescriptor.d("appBuildVersion");
        public static final FieldDescriptor e = FieldDescriptor.d("deviceManufacturer");
        public static final FieldDescriptor f = FieldDescriptor.d("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.d("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, androidApplicationInfo.m());
            objectEncoderContext.k(c, androidApplicationInfo.n());
            objectEncoderContext.k(d, androidApplicationInfo.i());
            objectEncoderContext.k(e, androidApplicationInfo.l());
            objectEncoderContext.k(f, androidApplicationInfo.k());
            objectEncoderContext.k(g, androidApplicationInfo.j());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {
        public static final ApplicationInfoEncoder a = new ApplicationInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d(RemoteConfigConstants.RequestFieldKey.W);
        public static final FieldDescriptor c = FieldDescriptor.d("deviceModel");
        public static final FieldDescriptor d = FieldDescriptor.d("sessionSdkVersion");
        public static final FieldDescriptor e = FieldDescriptor.d("osVersion");
        public static final FieldDescriptor f = FieldDescriptor.d("logEnvironment");
        public static final FieldDescriptor g = FieldDescriptor.d("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, applicationInfo.j());
            objectEncoderContext.k(c, applicationInfo.k());
            objectEncoderContext.k(d, applicationInfo.n());
            objectEncoderContext.k(e, applicationInfo.m());
            objectEncoderContext.k(f, applicationInfo.l());
            objectEncoderContext.k(g, applicationInfo.i());
        }
    }

    /* loaded from: classes3.dex */
    public static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {
        public static final DataCollectionStatusEncoder a = new DataCollectionStatusEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("performance");
        public static final FieldDescriptor c = FieldDescriptor.d("crashlytics");
        public static final FieldDescriptor d = FieldDescriptor.d("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, dataCollectionStatus.g());
            objectEncoderContext.k(c, dataCollectionStatus.f());
            objectEncoderContext.f(d, dataCollectionStatus.h());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {
        public static final ProcessDetailsEncoder a = new ProcessDetailsEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("processName");
        public static final FieldDescriptor c = FieldDescriptor.d("pid");
        public static final FieldDescriptor d = FieldDescriptor.d("importance");
        public static final FieldDescriptor e = FieldDescriptor.d("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, processDetails.i());
            objectEncoderContext.c(c, processDetails.h());
            objectEncoderContext.c(d, processDetails.g());
            objectEncoderContext.a(e, processDetails.j());
        }
    }

    /* loaded from: classes3.dex */
    public static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {
        public static final SessionEventEncoder a = new SessionEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("eventType");
        public static final FieldDescriptor c = FieldDescriptor.d("sessionData");
        public static final FieldDescriptor d = FieldDescriptor.d("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, sessionEvent.g());
            objectEncoderContext.k(c, sessionEvent.h());
            objectEncoderContext.k(d, sessionEvent.f());
        }
    }

    /* loaded from: classes3.dex */
    public static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {
        public static final SessionInfoEncoder a = new SessionInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("sessionId");
        public static final FieldDescriptor c = FieldDescriptor.d("firstSessionId");
        public static final FieldDescriptor d = FieldDescriptor.d("sessionIndex");
        public static final FieldDescriptor e = FieldDescriptor.d("eventTimestampUs");
        public static final FieldDescriptor f = FieldDescriptor.d("dataCollectionStatus");
        public static final FieldDescriptor g = FieldDescriptor.d("firebaseInstallationId");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, sessionInfo.m());
            objectEncoderContext.k(c, sessionInfo.l());
            objectEncoderContext.c(d, sessionInfo.n());
            objectEncoderContext.b(e, sessionInfo.j());
            objectEncoderContext.k(f, sessionInfo.i());
            objectEncoderContext.k(g, sessionInfo.k());
        }
    }

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        encoderConfig.b(SessionEvent.class, SessionEventEncoder.a);
        encoderConfig.b(SessionInfo.class, SessionInfoEncoder.a);
        encoderConfig.b(DataCollectionStatus.class, DataCollectionStatusEncoder.a);
        encoderConfig.b(ApplicationInfo.class, ApplicationInfoEncoder.a);
        encoderConfig.b(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.a);
        encoderConfig.b(ProcessDetails.class, ProcessDetailsEncoder.a);
    }
}

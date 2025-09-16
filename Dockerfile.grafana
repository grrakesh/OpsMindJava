FROM grafana/grafana:12.1.1

# Install CA certificates package
USER root
RUN apk add --no-cache ca-certificates

# Update CA store
RUN update-ca-certificates

USER grafana

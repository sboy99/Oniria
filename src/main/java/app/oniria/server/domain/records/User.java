package app.oniria.server.domain.records;

import app.oniria.server.domain.enums.Role;

import java.time.LocalDateTime;

public record User(
        String id,
        String name,
        String slug,
        Role[] roles,
        LocalDateTime createdAt,
        LocalDateTime updatedAt

) {
}

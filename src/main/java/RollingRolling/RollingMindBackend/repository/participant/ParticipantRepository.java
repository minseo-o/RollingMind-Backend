package RollingRolling.RollingMindBackend.repository.participant;

import RollingRolling.RollingMindBackend.domain.participant.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findAllByRoomId(String roomId);
}
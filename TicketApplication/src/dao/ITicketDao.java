package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import bean.BookedDetail;
import bean.TicketBean;
import exception.TicketException;

public interface ITicketDao 
{
	public String addTain(TicketBean ticketBean) throws TicketException, ClassNotFoundException, IOException, SQLException;
	public TicketBean viewSeat(String trainNo) throws TicketException, ClassNotFoundException, IOException, SQLException;
	public List<TicketBean> retrieveAll() throws TicketException, ClassNotFoundException, IOException, SQLException;
	public int bookTicket(BookedDetail bookedDetail) throws TicketException, ClassNotFoundException, IOException, SQLException;
	public int cancellation(int pnr); 
}
